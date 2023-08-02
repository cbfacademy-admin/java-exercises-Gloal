package com.cbfacademy.cars;


public class App {

    public static void main (String args[]){
        Cars car1 = new Cars("Volvo","V40",2012);
        System.out.println(car1);

        Cars car2 = new Cars("Porsche", "Panamera", 2009);
        System.out.println(car2.getModel());

        Cars car3 = new Cars("Audi", "A3", 2018);
        System.out.println(car3.getYear());
    }
    
}
