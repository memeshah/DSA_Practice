package com.Kunal.Arrays;

import java.util.Arrays;

public class Panagram {
    public static void main(String[] args) {
        boolean out = performPanagram();
        System.out.println(out);
    }

    private static boolean performPanagram() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        int[] alphabet = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            int a = sentence.charAt(i);
            alphabet[a - 'a']++;
        }
        for (int j : alphabet) {
            if (j == 0) {
                return false;
            }
        }

        return true;
    }
}
