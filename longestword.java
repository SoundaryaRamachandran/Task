package com.example.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class longestword {
  //  public static void main(String[] args) {
//        String str = "dfsffffffffffffffffffffffff fffffffffffffffffffffffffffffff ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff dfsfd dsfsfsd sfsdsdfs sdfsfsdsdfds dsgdsfsfsd dsfsdfsdfs dsfsdfsdf sdfssdfsd sffdfsdfs";
//        String longestwords = Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
//        System.out.println(longestwords + ",length" + longestwords.length());
        public static void main(String [ ] args) throws FileNotFoundException {
            new longestword().findLongestWords();
        }
        public String findLongestWords() throws FileNotFoundException {
            String longest_word = "";
            String current;
            Scanner sc = new Scanner(new File("C://Users//Soundarya//Downloads//java//longest.txt"));
            while (sc.hasNext()) {
                current = sc.next();
                if (current.length() > longest_word.length()) {
                    longest_word = current;
                }
            }
            System.out.println("\n"+longest_word+"\n"+longest_word.length());
            return longest_word;
        }
    }

