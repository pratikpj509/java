package com.demo.test;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringFilterToFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List 1: Store user input strings
        ArrayList<String> list1 = new ArrayList<>();

        System.out.print("How many strings you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Accept strings from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            list1.add(sc.nextLine());
        }

        // List 2: Filter strings starting with 'A'
        List<String> list2 = list1.stream()
                                  .filter(s -> s.startsWith("A"))
                                  .collect(Collectors.toList());

        // Write list2 data to file
        try (FileWriter fw = new FileWriter("data.txt")) {
            for (String s : list2) {
                fw.write(s + "\n");
            }
            System.out.println("Data successfully written to data.txt");
        } catch (IOException e) {
            System.out.println("File error occurred");
        }

        sc.close();
    }
}
