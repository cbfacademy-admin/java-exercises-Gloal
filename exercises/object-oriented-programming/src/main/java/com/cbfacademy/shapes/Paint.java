package com.cbfacademy.shapes;

public class Paint {
    double coverage;

    public Paint(Double coverage){
        this.coverage = coverage;
    }
    double amount(Shape shape){
        return coverage * shape.area();
    }
    
}
