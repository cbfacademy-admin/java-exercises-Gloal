package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
//import jav.util.Array;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        
        List<String> results = new ArrayList<String>();
        for(Integer n: numbers){
            if(n%3==0 && n%5==0){
                results.add("FizzBuzz");
            }
            else if(n%3==0){
                results.add("Fizz");}
            else if(n%5==0){
                results.add("Buzz");
            }else{
                results.add(n.toString());
            }}
            return results;
        
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
/*         switch(number){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3: 
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8: 
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11: 
                return "November";
            case 12: 
                return "December";
            default:
                return "Invalid month number";
        }

 */
        Map<Integer, String> monthsMap = new HashMap<Integer,String>(){{put(1, "January");
                                                put(2, "February"); put(3, "March"); 
                                                put(4, "April"); put(5, "May"); put(6, "June");
                                                put(7, "July"); put(8, "August"); put(9, "September");
                                                put(10, "October"); put(11, "November"); put(12, "December");  }};
    
        if(number > 0 && number <= 12){
            return monthsMap.get(number); }
        else{
            return "Invalid month number";
        }
    }


    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        int calculatedSumOfEvens = 0;
        Integer calculatedSumOfOdds = 0;
        for(int i = 0; i<=100; i++){
            if(i%2 == 0){

                calculatedSumOfEvens+=i;
            }else{
                calculatedSumOfOdds+=i;
            }
        }

        Map<String, Integer> mapOfSums = new HashMap<String, Integer>();
            mapOfSums.put("SumOfEvens", calculatedSumOfEvens); 
            mapOfSums.put("SumOfOdds", calculatedSumOfOdds);

        return mapOfSums;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        Integer [] numbersList = new Integer[numbers.size()];
        numbersList = numbers.toArray(numbersList);
        List<Integer> results = new ArrayList<Integer>();
        for(int i=numbers.size()-1; i>=0; i-- ){
            results.add(numbersList[i]);
        }
        return results;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
