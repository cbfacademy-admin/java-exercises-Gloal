package com.cbfacademy.cars;


public class Cars{
    private String make;
    private String model;
    private Integer year;
    
    public Cars(String make, String model, Integer year){
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public Integer getYear(){
        return this.year;
    }
}