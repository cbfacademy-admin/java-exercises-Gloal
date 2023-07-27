package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String word = "";
        for(int i = 0; i < characters.length; i++){
            word+=characters[i];

        }
        return word;

        
    }

    public Long howMany(String text, Character character) {
        long count = 0;
        int textSize = text.length();
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        if (textSize!= 0){
        for(int i =0; i<textSize; i++){
            if(text.charAt(i) == character){count ++;}
        }}
        return count;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        boolean isPalindrome = false;
                int wordSize = word.length();

         if(wordSize!=0)   {   
                    char[] checkword = word.toCharArray();
                    isPalindrome = true;
 
            for(int i=0, j=wordSize-1; i<wordSize; i++, j--){
                    if(checkword[i] == checkword[j]){
                        isPalindrome =   true && isPalindrome;
                     }else{
                        isPalindrome =  isPalindrome && false;
                    }
                }
            }
        return isPalindrome;
    }

    public String getName() {
        return "String Exercises";
    }
}
