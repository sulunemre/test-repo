package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        readFile("file1.txt");
    }


    public static void readFile(String inputPath) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(inputPath))){
            int intVal;
            while ((intVal = br.read()) > 0){
                char charVal = (char)intVal;
                System.out.println(charVal);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
