package com.danasoft.puzzlejava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        scanner = new Scanner(System.in);
        PuzzleJava p = new PuzzleJava();
        clearScreen();
        System.out.println("\r\n\r\n\t\t\t-------------\r\n\t\t\t|Puzzle Java|\r\n\t\t\t-------------\r\n\r\n");
        pressEnterToContinue();
        System.out.println("\r\n\t\t1) Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the");
        System.out.println("\t\tsum of all numbers in the array. Also have the function return an array that only");
        System.out.println("\t\tincludes numbers that are greater than 10 (e.g. when you pass the array above, it");
        System.out.println("\t\tshould return an array with the values of 13,25,32)\r\n\r\n");

        System.out.printf("\r\n\tValues > 10: %s", Arrays.toString(p.puzz1()));

        pressEnterToContinue();
        System.out.println("\r\n\t\t2) Create an array with the following values: Nancy, Jinichi, Fujibayashi,");
        System.out.println("\t\tMomochi, Ishikawa. Shuffle the array and print the name of each person.");
        System.out.println(
                "\t\tHave the method also return an array with names that are longer than 5 characters.\r\n\r\n");

        System.out.println("\r\n\tNames longer than 5 chars: " + Arrays.toString(p.puzz2()));

        pressEnterToContinue();
        System.out.println("\r\n\t\t3) Create an array that contains all 26 letters of the alphabet (this array must");
        System.out.println("\t\thave 26 values). Shuffle the array and, after shuffling, display the last letter");
        System.out.println("\t\tfrom the array. Have it also display the first letter of the array. If the first");
        System.out.println("\t\tletter in the array is a vowel, have it display a message.\r\n\r\n");
        p.puzz3(lower);
        pressEnterToContinue();
        System.out.println("\r\n\t\t4) Generate and return an array with 10 random numbers between 55-100.\r\n\r\n");

        System.out.println("\r\n\tRandom array: " + Arrays.toString(p.puzz4()));
        pressEnterToContinue();
        System.out.println("\r\n\t\t5) Generate and return an array with 10 random numbers between 55-100 and have");
        System.out
                .println("\t\tit be sorted (showing the smallest number in the beginning). Display all the numbers in");
        System.out.println(
                "\t\tthe array. Next, display the minimum value in the array as well as the maximum value.\r\n\r\n");

        System.out.println("\r\n\tReturned array: " + Arrays.toString(p.puzz5()));
        pressEnterToContinue();
        System.out.println("\r\n\t\t6) Create a random string that is 5 characters long.\r\n\r\n");

        System.out.println("\r\n\tString: " + p.puzz6(lower, 5));
        pressEnterToContinue();
        System.out.println(
                "\r\n\t\t7) Generate an array with 10 random strings that are each 5 characters long.\r\n\r\n");

        System.out.println("\tArray: " + Arrays.toString(p.puzz7(lower, 10, 5)));
        pressEnterToContinue();

        scanner.close();
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void pressEnterToContinue() {
        System.out.println("\r\n\tPress <ENTER> to continue...");
        scanner.nextLine();
        clearScreen();
    }
}
