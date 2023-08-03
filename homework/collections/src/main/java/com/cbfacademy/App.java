package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Collection<Integer> integers = new ArrayList<Integer>(Arrays.asList(2,4,6,8,743,12,12,8,90));

        HashSet<Integer> noDuplicateSet = new HashSet<Integer>();
       // Collections.addAll(noDuplicateSet, integers);
        noDuplicateSet.addAll(integers);
        
        if(noDuplicateSet.size() < integers.size()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    }
