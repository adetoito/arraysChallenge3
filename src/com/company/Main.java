package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int index = -1;

        String names[] = new String[1000];
        int grades[] = new int[1000];

        while (true) {

            index++;

            System.out.println("Enter a name.");
            System.out.println("To finish and calculate class average, type Done.");
            String temp = sc.nextLine();

            if (temp.equals("Done")) {
                break;
            } else {
                names[index] = temp;
            }

            System.out.println("Enter their grade.");
            grades[index] = sc.nextInt();

        }

    }
}
