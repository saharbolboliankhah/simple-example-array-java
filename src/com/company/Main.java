package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter n : ");
        int n = scanner.nextInt();
        String[] array = new String[n];
        scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            System.out.format("enter a[%d]: ", i);
            array[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
//        System.out.println(array);

        System.out.println("press 1 : ( calculate avarage of string length ) ");
        System.out.println("press 2 : ( calculate sum of string length ) ");
        System.out.println("press exit");
        boolean exit = false;
        int sum = 0;
        while (!exit) {
            System.out.print("\nwhat do you want ? ");
            String input = scanner.next();
            switch (input) {
                case "1":
                    sum = countChar(array);
                    double avg = (double) sum / array.length;
                    System.out.format("avarage = %.3f", avg);
                    break;
                case "2":
                    sum = countChar(array);
                    System.out.format("sum = %d", sum);
                    break;
                case "exit":
                    exit = true;
                    System.out.print("Bye Bye");
                    break;
                default:
                    System.out.print("Wrong code !!");
                    break;
            }
        }

        scanner.close();
    }

    //a\t\n
    static int countChar(String[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println(array[i].length());
            sum += array[i].length();
        }
        return sum;
    }
}



