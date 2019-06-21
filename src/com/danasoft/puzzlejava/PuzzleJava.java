package com.danasoft.puzzlejava;

import java.util.*;

class PuzzleJava {


    // 1) Create an array with the following values: 3,5,1,2,7,9,8,13,25,32.
    // Print the sum of all numbers in the array. Also have the function return
    // an array that only includes numbers that are greater than 10 (e.g. when
    // you pass the array above, it should return an array with the values of
    // 13,25,32)

    Integer[] puzz1() {
        final int[] arr1 = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        System.out.println("\tArray: " + Arrays.toString(arr1) + "\r\n");
        ArrayList<Integer> retVal = new ArrayList<>();
        int sum = 0;
        for (int num : arr1) {
            sum += num;
            if (num > 10)
                retVal.add(num);
        }
        System.out.println("\r\n\tSum: " + sum);
        return retVal.toArray(new Integer[0]);
    }

    // 2) Create an array with the following values: Nancy, Jinichi, Fujibayashi,
    // Momochi, Ishikawa. Shuffle the array and print the name of each person.
    // Have the method also return an array with names that are longer than 5
    // characters.

    String[] puzz2() {
        String[] arr2 = new String[]{"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println("\tArray: " + Arrays.toString(arr2));
        List<String> shuffleList = Arrays.asList(arr2);
        Collections.shuffle(shuffleList);
        String[] overFive = new String[shuffleList.size()];
        int index = 0;
        for (String name : shuffleList) {
            System.out.println("\t" + name);
            if (name.length() > 5)
                overFive[index++] = name;
        }
        return Arrays.stream(overFive)
                .filter(value ->
                        value != null && value.length() > 0
                )
                .toArray(String[]::new);
    }

    // 3) Create an array that contains all 26 letters of the alphabet (this array
    // must
    // have 26 values).
    // Shuffle the array and, after shuffling, display the last letter from the
    // array. Have it also
    // display the first letter of the array. If the first letter in the array is a
    // vowel, have it display a message.

    void puzz3(String seed) {
        final Character[] arr3 = new Character[26];
        for (int i = 0; i < 26; i++) {
            arr3[i] = seed.charAt(i);
        }
        System.out.printf("\tOriginal array: %s\r\n", Arrays.toString(arr3));
        List<Character> cList = Arrays.asList(arr3);
        Collections.shuffle(cList);
        System.out.printf("\tShuffled array: %s\r\n", cList.toString());
        System.out.printf("\tLast char: " + cList.get(cList.size() - 1) + "\r\n");
        char c = cList.get(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("\tPat, I'd like to buy a vowel!");
        }
    }

    // 4) Generate and return an array with 10 random numbers between 55-100.
    Integer[] puzz4() {
        Integer[] retVal = new Integer[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            retVal[i] = r.nextInt(45) + 55;
        }
        return retVal;
    }

    // 5) Generate and return an array with 10 random numbers between 55-100 and
    // have
    // it be sorted (showing the smallest number in the beginning). Display all the
    // numbers in
    // the array. Next, display the minimum value in the array as well as the
    // maximum value.

    Integer[] puzz5() {
        Integer[] arr5 = puzz4();
        System.out.printf("\tOriginal array: %s\r\n", Arrays.toString(arr5));
        List<Integer> sortList = Arrays.asList(arr5);
        Collections.sort(sortList);
        System.out.printf("\tSorted array: %s\r\n", sortList.toString());
        int first = sortList.get(0);
        int max = first, min = first, sum = first;
        for (int i = 1; i < sortList.size(); i++) {
            int num = sortList.get(i);
            sum += num;
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        String output = String.format("\tMax: %d   Min: %d\r\n", max, min);
        System.out.println(output);
        output = String.format("\tJust for fun, here's the average: %d\r\n", sum / sortList.size());
        System.out.println(output);
        return sortList.toArray(new Integer[0]);
    }

    // 6) Create a random string that is 5 characters long.

    String puzz6(String letters, int len) {
        Random r = new Random();
        StringBuilder retVal = new StringBuilder();
        while (retVal.length() < len) {
            retVal.append(letters.charAt(r.nextInt(letters.length())));
        }
        return retVal.toString();
    }

    // 7) Generate an array with 10 random strings that are each 5 characters long

    String[] puzz7(String letters, int arrLen, int strLen) {
        String[] retVal = new String[arrLen];
        int index = 0;
        while (index < arrLen) {
            retVal[index++] = puzz6(letters, strLen);
        }
        return retVal;
    }



}
