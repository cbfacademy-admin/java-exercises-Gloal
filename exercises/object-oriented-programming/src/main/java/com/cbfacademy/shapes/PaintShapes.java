package com.cbfacademy.shapes;

public class PaintShapes {
    public static void main (String[] args){
        Rectangle rect = new Rectangle(35.0, 20);
        Sphere ball = new Sphere(15);
        Cylinder cyl = new Cylinder(10, 30);


        Paint paint = new Paint(2.5);
        System.out.println(paint.amount(rect) + paint.amount(ball) + paint.amount(cyl));
    }


    
}
