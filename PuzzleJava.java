import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.*;

public class PuzzleJava {
    private static Scanner scanner;

    static String lower = "abcdefghijklmnopqrstuvwxyz";

    private static void pressEnterToContinue() {
        System.out.println("\r\n\tPress <ENTER> to continue...");
        scanner.nextLine();
        clearScreen();
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
        }
    }

    // 1) Create an array with the following values: 3,5,1,2,7,9,8,13,25,32.
    // Print the sum of all numbers in the array. Also have the function return
    // an array that only includes numbers that are greater than 10 (e.g. when
    // you pass the array above, it should return an array with the values of
    // 13,25,32)

    private static ArrayList<Integer> puzz1() {
        final int[] arr1 = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        System.out.println("\tArray: " + Arrays.toString(arr1) + "\r\n");
        ArrayList<Integer> retVal = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            System.out.println("\t" + num);
            sum += num;
            if (num > 10)
                retVal.add(num);
        }
        System.out.println("\r\n\tSum: " + sum);
        return retVal;
    }

    // 2) Create an array with the following values: Nancy, Jinichi, Fujibayashi,
    // Momochi, Ishikawa. Shuffle the array and print the name of each person.
    // Have the method also return an array with names that are longer than 5
    // characters.

    private static ArrayList<String> puzz2() {
        ArrayList<String> arr2 = new ArrayList<String>(
                Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        System.out.println("\tArray: " + arr2);
        ArrayList<String> retVal = new ArrayList<>();
        Collections.shuffle(arr2);
        for (int i = 0; i < arr2.size(); i++) {
            String name = arr2.get(i);
            System.out.println("\t" + name);
            if (name.length() > 5)
                retVal.add(name);
        }
        return retVal;
    }

    // 3) Create an array that contains all 26 letters of the alphabet (this array
    // must
    // have 26 values).
    // Shuffle the array and, after shuffling, display the last letter from the
    // array. Have it also
    // display the first letter of the array. If the first letter in the array is a
    // vowel, have it display a message.

    private static void puzz3() {
        final ArrayList<Character> arr3 = new ArrayList<Character>();
        for (int i = 0; i < 26; i++) {
            arr3.add(lower.charAt(i));
        }
        System.out.println("\tOriginal array: " + arr3);
        Collections.shuffle(arr3);
        System.out.println("\tShuffled array: " + arr3);
        System.out.println("\tLast char: " + arr3.get(arr3.size() - 1) + "\r\n");
        char c = arr3.get(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("\tPat, I'd like to buy a vowel!");
        }
    }

    // 4) Generate and return an array with 10 random numbers between 55-100.
    private static ArrayList<Integer> puzz4() {
        ArrayList<Integer> retVal = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            retVal.add(r.nextInt(45) + 55);
        }
        return retVal;
    }

    // 5) Generate and return an array with 10 random numbers between 55-100 and
    // have
    // it be sorted (showing the smallest number in the beginning). Display all the
    // numbers in
    // the array. Next, display the minimum value in the array as well as the
    // maximum value.

    private static ArrayList<Integer> puzz5() {
        ArrayList<Integer> retVal = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            retVal.add(r.nextInt(45) + 55);
        }
        System.out.println("\tOriginal array: " + retVal);
        Collections.sort(retVal);
        System.out.println("\tSorted array:   " + retVal);
        int first = retVal.get(0);
        int max = first, min = first, sum = first;
        for (int i = 1; i < retVal.size(); i++) {
            int num = retVal.get(i);
            sum += num;
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        String output = String.format("\tMax: %d   Min: %d", max, min);
        System.out.println(output);
        output = String.format("\tJust for fun, here's the average: %d", sum / retVal.size());
        return retVal;
    }

    // 6) Create a random string that is 5 characters long.

    private static String puzz6(String letters, int len) {
        Random r = new Random();
        StringBuilder retVal = new StringBuilder();
        while (retVal.length() < len) {
            retVal.append(letters.charAt(r.nextInt(letters.length())));
        }
        return retVal.toString();
    }

    // 7) Generate an array with 10 random strings that are each 5 characters long

    private static ArrayList<String> puzz7(String letters, int arrLen, int strLen) {
        ArrayList<String> retVal = new ArrayList<String>();
        while (retVal.size() < arrLen) {
            retVal.add(puzz6(letters, strLen));
        }
        return retVal;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        clearScreen();
        System.out.println("\r\n\r\n\t\t\t-------------\r\n\t\t\t|Puzzle Java|\r\n\t\t\t-------------\r\n\r\n");
        pressEnterToContinue();
        System.out.println("\r\n\t\t1) Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the");
        System.out.println("\t\tsum of all numbers in the array. Also have the function return an array that only");
        System.out.println("\t\tincludes numbers that are greater than 10 (e.g. when you pass the array above, it");
        System.out.println("\t\tshould return an array with the values of 13,25,32)\r\n\r\n");

        System.out.println("\r\n\tValues > 10: " + puzz1());

        pressEnterToContinue();
        System.out.println("\r\n\t\t2) Create an array with the following values: Nancy, Jinichi, Fujibayashi,");
        System.out.println("\t\tMomochi, Ishikawa. Shuffle the array and print the name of each person.");
        System.out.println(
                "\t\tHave the method also return an array with names that are longer than 5 characters.\r\n\r\n");

        System.out.println("\r\n\tNames longer than 5 chars: " + puzz2());

        pressEnterToContinue();
        System.out.println("\r\n\t\t3) Create an array that contains all 26 letters of the alphabet (this array must");
        System.out.println("\t\thave 26 values). Shuffle the array and, after shuffling, display the last letter");
        System.out.println("\t\tfrom the array. Have it also display the first letter of the array. If the first");
        System.out.println("\t\tletter in the array is a vowel, have it display a message.\r\n\r\n");

        puzz3();
        pressEnterToContinue();
        System.out.println("\r\n\t\t4) Generate and return an array with 10 random numbers between 55-100.\r\n\r\n");

        System.out.println("\r\n\tArray: " + puzz4());
        pressEnterToContinue();
        System.out.println("\r\n\t\t5) Generate and return an array with 10 random numbers between 55-100 and have");
        System.out
                .println("\t\tit be sorted (showing the smallest number in the beginning). Display all the numbers in");
        System.out.println(
                "\t\tthe array. Next, display the minimum value in the array as well as the maximum value.\r\n\r\n");

        System.out.println("\r\n\tReturned array: " + puzz5());
        pressEnterToContinue();
        System.out.println("\r\n\t\t6) Create a random string that is 5 characters long.\r\n\r\n");

        System.out.println("\r\n\tString: " + puzz6(lower, 5));
        pressEnterToContinue();
        System.out.println(
                "\r\n\t\t7) Generate an array with 10 random strings that are each 5 characters long.\r\n\r\n");

        System.out.println("\tArray: " + puzz7(lower, 10, 5));
        pressEnterToContinue();

        scanner.close();
    }

}