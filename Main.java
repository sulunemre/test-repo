package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //bufferedReader();
        //Strings.stringJoiner();
        //Strings.formatSpecifier();
        //Collections.lambdaExpressions();
        Collections.mapCollections();
    }


    public static void bufferedReader() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("file1.txt"))){
            int intVal;
            while ((intVal = br.read()) >= 0){
                char charVal = (char)intVal;
                System.out.print(charVal);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
