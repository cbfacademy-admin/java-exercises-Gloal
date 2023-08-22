package com.cbfacademy;

public class FileExtension {
    public int check (String filename) throws NullFilenameException{
        int java = 0;
        if(filename == null || filename.isEmpty()){
            throw new NullFilenameException("Filename is Empty!!");
        }else if (filename.endsWith(".java")){
            java = 1;
        }else if (!filename.endsWith(".java")){
            java = 0;
        }

        return java;
    }
}
