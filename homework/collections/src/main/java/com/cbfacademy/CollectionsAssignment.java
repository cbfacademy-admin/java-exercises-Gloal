package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     *  Your solution must traverse the list from last to first element
     *    removing any values less than minValue.
     */
    //Could have used the java.re
    public static void removeSmallInts(List<Integer> list, int minValue) {
        for(int i = list.size()-1; i>=0; i--){
            if(list.get(i) < minValue){
                list.remove(i);
                }
            }
        

        //Method 2
  /*       ListIterator listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            listIterator.removeIf(listIterator<)
        } */
    }



    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.

        HashSet<Integer> noDuplicateSet = new HashSet<Integer>();
       // Collections.addAll(noDuplicateSet, integers);
        noDuplicateSet.addAll(integers);

        if(noDuplicateSet.size() < integers.size()){
            return true;
        }else{
            return false;}
    }



    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        SortedSet<Integer> newSet = new TreeSet<Integer>();
        newSet.addAll(ints1);
        newSet.addAll(ints2);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.addAll(newSet);
        return  arrayList;
    }



    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
    
        //First use a set so that only unique values from each collection is stored
    Set<Integer> newSet1 = new HashSet<>();
    newSet1.addAll(ints1);

    Set<Integer> newSet2 = new HashSet<>();
    newSet2.addAll(ints2);

    //retainAll method returns only the common values in two collections and stores the result in the first collection
    newSet1.retainAll(newSet2);

    ArrayList<Integer> newList = new ArrayList<Integer>();
    newList.addAll(newSet1);
    return newList;

    //The althernative could be using the stream/filter contains method but I do not know how it works yet - will review soon
    //return ints1.stream().filter(ints2::contains).collect(Collectors.toCollection(ArrayList::new));
    
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        
    public static String mostFrequent(List<String> list) {

        Map<String, Integer> mostFrequentMap = new HashMap<String, Integer>();
        Integer count = 1;
        Integer maxicount = 0;
        String mostCount = null;
        for(String s: list){
            if(mostFrequentMap.containsKey(s)){
                mostFrequentMap.put(s, mostFrequentMap.get(s)+1);
            }else{mostFrequentMap.put(s, count);}
        }

        for(String s: mostFrequentMap.keySet()){
            if(mostFrequentMap.get(s)>maxicount){
                maxicount = mostFrequentMap.get(s);
                mostCount = s;}
        }

        return mostCount;
    }


    public static String getName() {
        return "Collections Assignment";
    }
}
