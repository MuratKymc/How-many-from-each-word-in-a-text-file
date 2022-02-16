package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static void countWords(String fileName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(fileName);

        Scanner scanner = new Scanner(fileInputStream);

        ArrayList<String> word = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();

        while (scanner.hasNext()) {
            String nextWord = scanner.next().toLowerCase();
            if (word.contains(nextWord)) {
                int i = word.indexOf(nextWord);
                count.set(i, count.get(i) + 1);

            } else {
                word.add(nextWord);
                count.add(1);
            }

        }
        scanner.close();
        fileInputStream.close();

        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i) + " = " + count.get(i) + " time(s)");
        }


    }

}

