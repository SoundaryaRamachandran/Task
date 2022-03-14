package com.example.demo;

public class palindrom {

    private static String palindrom (String str){

        int longest = 0, startIndex = 0, endIndex = 0;
        int n = str.length();
        boolean[][] palindro = new boolean[n][n];

        for (int j = 0; j < str.length(); j++) {
            palindro[j][j] = true;
            for (int i = 0; i < j; i++) {
                if (str.charAt(i) == str.charAt(j) && (j - i <= 2 || palindro[i + 1][j - 1])) {
                    palindro[i][j] = true;
                    if (j - i + 1 > longest) {
                        longest = j - i + 1;
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }
        return str.substring(startIndex, endIndex + 1);
    }

    public static void main (String[]args){
        String str="theehtquickbrownfoxxofnworbquickkciuq";
        System.out.println(palindrom(str )  +" "+ palindrom(str ).length());
    }
}


