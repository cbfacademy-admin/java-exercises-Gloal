package com.cbfacademy.shapes;

public class Sphere extends Shape{
    double radius;

    public Sphere(double radius){
        this.radius = radius;
        this.shapeName = "Sphere";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double area(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
