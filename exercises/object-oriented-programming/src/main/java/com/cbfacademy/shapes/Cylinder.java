package com.cbfacademy.shapes;

public class Cylinder extends Shape{
    double radius;
    double height;

    public Cylinder(double radius, double height){
        this.shapeName = "Cylinder";
        this.radius = radius;
        this.height = height;
    }

    double area(){
        return height * Math.PI * Math.pow(radius, 2);
    }
    
}
