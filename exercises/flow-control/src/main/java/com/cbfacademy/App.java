package com.cbfacademy;

public class App {
   
    public static void main(String[] args) {

        System.out.println("Today is "+ matchDays(findToday())); 
    }


    public static String matchDays(Integer i){
        switch(i){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid Input";
        } 
    }

        
    public static  Integer findToday(){
            
        int[] weekdays = {1,2,3,4,5,6,7};   
        int whatIsToday = 0;         

        for(int i : weekdays){
            Integer today = i;
            Integer yesterday;
            Integer tomorrow ;
            
            if(i==1){
                yesterday = 7; }
            else{
                yesterday = i-1;
            }
            
            if(i==7){
                tomorrow = 1;
            }else{
                tomorrow = i+1;
            }

            if((tomorrow != 3 && tomorrow != 4) 
                && (yesterday!= 5 && yesterday!=6)
                    && (today != 4 && today != 7 && today != 1)){
                        whatIsToday =  today;
                }
        }
    return whatIsToday;
        }
}

