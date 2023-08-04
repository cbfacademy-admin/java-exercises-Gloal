package com.cbfacademy.shapes;

 abstract class Shape {
    String shapeName;

    abstract double area();
    
    public String  toString(){
        return shapeName;
    }
}
