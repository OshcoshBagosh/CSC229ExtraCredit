package org.example;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String[] words = {"angel","dusty","save","glean","study","vase"};
        sortAnagrams(words);
        System.out.println(Arrays.toString(words));
    }

    public static void sortAnagrams(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    String temp = words[i+1];
                    words[i+1] = words[j];
                    words[j] = temp;
                    break;
                }
            }
        }
    }

    public static boolean isAnagram(String word1, String word2) {
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

}
