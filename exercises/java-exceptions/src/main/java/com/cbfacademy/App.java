package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.powermock.reflect.exceptions.FieldNotFoundException;

import it.larusba.neo4j.jdbc.impl.ListArray;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NullFilenameException
    {
        HashMap<String, Integer> filesMap = new HashMap<String, Integer>();
      
        String filesArray[] = new String[]{"App.java", "App.txt", null, "App.md"};

        List<String> filenames = new ArrayList<String>(Arrays.asList(filesArray));

        for (String s:filenames){
            FileExtension fe = new FileExtension();
            int key = 0;
            try{
                key = fe.check(s);
            }catch (NullFilenameException e){
                key = -1;
            }finally{
            filesMap.put(s, key);
            }
        }
        System.out.println(filesMap);
    }
}
