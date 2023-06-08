package org.example.dto;

import java.util.List;


public class Tests {

    private Integer id;
    private String title;
    private String value;
    private List<Tests> values;

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getValue(){
        return this.value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public List<Tests> getValues(){
        return this.values;
    }

    public void setValues(List<Tests> values){
        this.values = values;
    }
}
