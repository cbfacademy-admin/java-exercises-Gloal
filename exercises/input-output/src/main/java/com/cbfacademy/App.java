package com.cbfacademy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) {
        //String filepath = "C:\Userssrc/main/resources/exercise.txt";  Does not work - need to use escape format like below
        String filepath = "C:///Users/Gigi/Documents/CBF/java-exercises-Gloal/exercises/input-output/src/main/resources/exercise.txt";
        String newFilePath = "C:///Users/Gigi/Documents/CBF/java-exercises-Gloal/exercises/input-output/src/main/resources/exit.txt";
        String invertedFilePath = "C:///Users/Gigi/Documents/CBF/java-exercises-Gloal/exercises/input-output/src/main/resources/inverted.txt";
    
    try (
        FileInputStream fileInput = new FileInputStream(filepath);
        InputStreamReader streamReader = new InputStreamReader(fileInput);
        LineNumberReader lineNumber = new LineNumberReader(streamReader);
        FileWriter fw = new FileWriter(invertedFilePath);
        PrintWriter pw = new PrintWriter(newFilePath);
    ){
        String outputLine = lineNumber.readLine();
        while(outputLine!= null){
            fw.append(outputLine);
            pw.println(outputLine); //both methods print an extra line
            System.out.println(outputLine);
            outputLine = lineNumber.readLine();
        }
    }catch (IOException e){
        System.out.println("Cannot find what to read "+e.getMessage());
    }
    }
}
