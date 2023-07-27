package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class App {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 7, 8, 11, 13, 17));
        Integer [] numbersList = new Integer[numbers.size()];
        numbersList = numbers.toArray(numbersList);
        List<Integer> results = new ArrayList<Integer>();
                            System.out.print(numbers.get(2));

                                System.out.print(numbers.size());

        for (int i=numbers.size()-1; i>=0; i-- ){
            results.add(numbers.get(i));
            System.out.print(numbers.get(i));

        }

        System.out.println( results);
    }

}
