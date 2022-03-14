package com.example.demo;

import java.util.Arrays;

public class permutation {

    public void printCombination(int n, String str, char[] arr) {
        if (n == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i=0; i < str.length(); i++) {
            arr[n] = str.charAt(i);
            printCombination(n+1, str, arr);
        }
    }

    public static void main(String[] args) {
        permutation obj = new permutation();
        String str = "PQR";
        obj.printCombination(0, str, new char[str.length()]);
        System.out.println();
    }
}