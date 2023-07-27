package com.cbfacademy;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );


        int []  integerAray = new int[8];
        System.out.println(integerAray.length);

        int[] integerArray = {2,3,4,5,6,7,8,9};
        float[] floatArray = {-12,-11,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1 };
        Double[] doubleArray = {1.1,1.2,1.3,1.4,1.5};
        Boolean[] booleanArray = {true, true, false, true, false, false};



            System.out.println(integerArray[4]);
            System.out.println(floatArray[4]);
            System.out.println(doubleArray[4]);
            System.out.println(booleanArray[4]);
          Object [][] matrixArray = {{integerArray, floatArray, doubleArray, booleanArray}};
          Object [][] anotherMatrixArray = new Object[1][4];
           anotherMatrixArray[0][0] = booleanArray;
           anotherMatrixArray[0][1] = doubleArray;
           anotherMatrixArray[0][2] = floatArray;
           anotherMatrixArray[0][3] = integerArray;

            System.out.println("Fulll Matrix: "+ anotherMatrixArray);

           System.out.println(Arrays.deepToString(matrixArray));

           for(Object[] i: anotherMatrixArray) {System.out.println(Arrays.toString(i));}

           Integer i;
           i = 9;
           System.out.println(i);

           int b = 9;

            System.out.println(i==b);
            System.out.println(i.equals(((Integer)b)));
            System.out.println(i.getClass());


    }

    

}
