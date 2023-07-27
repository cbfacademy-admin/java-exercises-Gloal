package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        LinkedList<Integer> newLinkedList = new LinkedList<Integer>();
        newLinkedList.addFirst(4);
        Integer[] newList = {5,6,8,2,9};

        Collections.addAll(newLinkedList, newList);


        newLinkedList.add(2,4);

       // newLinkedList.addAll(new LinkedList<Integer>(5,6,8,2,9);
        newLinkedList.addLast(2);
        System.out.println(newLinkedList.element());
        return newLinkedList;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - return the queue

        ArrayDeque<Integer> newArrayDeque = new ArrayDeque<>();
               //  - add 5, 6, 8, 9 to the the stack

        newArrayDeque.add(5);
        newArrayDeque.add(6);
        newArrayDeque.add(8);
        newArrayDeque.add(9);

        //  - print the first element of the queue on the screen
        System.out.print(newArrayDeque.getFirst());   
        //  - print the last element of the queue on the screen
        System.out.print(newArrayDeque.getLast());

        //  - invoke the method poll() on the queue and print the result on the screen

        System.out.print(newArrayDeque.poll());                
        //  - invoke the element() method on the queue and print the result on the screen

        System.out.print(newArrayDeque.element());        

        return newArrayDeque;

    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of keys from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
