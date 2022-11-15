package org.example;

import org.example.service.Solution;

import java.io.IOException;

public class Task {
    public static void main(String[] args) throws IOException {
        String writeTo = "";
        if(args.length < 3){
            writeTo = "report.json";
        } else {
            writeTo = args[2];
        }
        Solution.processFiles(args[0], args[1], writeTo);
    }
}