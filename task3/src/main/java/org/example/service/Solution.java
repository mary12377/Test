package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Tests;
import org.example.dto.Value;
import org.example.dto.Values;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<Integer, Tests> TESTS_MAP = new HashMap<>();

    public static void processFiles(String testsFilePaths, String valuesFilePaths, String writeTo) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Tests tests = objectMapper.readValue(new File(testsFilePaths), Tests.class);
        initMap(tests);
        Values values = objectMapper.readValue(new File(valuesFilePaths), Values.class);

        for (Value value : values.getValues()) {
            TESTS_MAP.get(value.getId()).setValue(value.getValue());
        }

        objectMapper.writeValue(new File(writeTo), tests);
    }

    public static void initMap(Tests tests){
        TESTS_MAP.put(tests.getId(), tests);
        if(tests.getValues() != null){
            for(Tests ent : tests.getValues()){
                initMap(ent);
            }
        }
    }
}

