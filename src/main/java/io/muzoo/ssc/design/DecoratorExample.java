package io.muzoo.ssc.design;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class DecoratorExample {

    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader("xxx.txt");
            Reader reader = new BufferedReader(fileReader);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
