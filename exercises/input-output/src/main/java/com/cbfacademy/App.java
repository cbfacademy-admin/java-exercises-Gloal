package com.cbfacademy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;

import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        String filePath = "exercises/input-output/src/main/resources/exercise.txt";
        String outputFilePath = "exercises/input-output/src/main/resources/copy.txt";
        String invertFilePath = "exercises/input-output/src/main/resources/inverted.txt";
        String invertFileDeque = "exercises/input-output/src/main/resources/invertedDeque.txt";
        String invertFileDeque2 = "exercises/input-output/src/main/resources/invertedDequeer2.txt";

        Deque<String> stack = new ArrayDeque<String>();

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            // print each line to terminal
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Not working " + e.getMessage());
        }


        // copy file to another file
        try {
            Files.copy(Paths.get(filePath), Files.newOutputStream(Paths.get(outputFilePath)));
        } catch (IOException e) {
        }


        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(stack::push);
            for (String s : stack) {
                Files.write(Paths.get(invertFileDeque), s.getBytes(), StandardOpenOption.APPEND);
                Files.write(Paths.get(invertFileDeque), "\n".getBytes(), StandardOpenOption.APPEND);
                // //this code doesnt run so the exception is thrown
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try {
            List<String> inputLines = Files.readAllLines(Paths.get(filePath));
            Collections.reverse(Arrays.asList(inputLines.get(0).split("\n")));
            System.out.println(inputLines.get(0));

            String[] inputLiness = inputLines.get(0).split("\n");
            System.out.println(inputLiness[0]);
        } catch (IOException e) {
            System.out.println("not posible" + e);
        }

        // // Specify the input and output file paths
        // String inputFile = "input.txt"; // Change this to your input file
        // String outputFile = "output.txt"; // Change this to your output file

        // Read the input file and reverse the sentences
        try {
            List<String> sentences = readSentencesFromFile(filePath);
            Collections.reverse(sentences);
            writeSentencesToFile(sentences, invertFilePath);
            System.out.println("Sentences reversed and written to " + invertFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read sentences from the input file
    private static List<String> readSentencesFromFile(String filePath) throws IOException {
        List<String> sentences = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            sentences.add(line);
        }
        reader.close();
        return sentences;
    }

    // Write sentences to the output file
    private static void writeSentencesToFile(List<String> sentences, String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (String sentence : sentences) {
            writer.write(sentence);
            writer.newLine();
        }
        writer.close();
    }
}
