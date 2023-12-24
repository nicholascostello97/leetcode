package array;

import java.util.Arrays;

/**
 Given a string, replace underscores with '%20'. Do not use arrayList. You are given length of actual string.

 Example 1:
 Input: n = "Mr John Smith    ", 13
 Output: "Mr%20John%20Smith"

 */
public class PalindromePermutation {
    public static void main(String[] args) {

        System.out.println("canPermutePalindrome() = " + canPermutePalindrome("code"));

        System.out.println("canPermutePalindrome() = " + canPermutePalindrome("aab"));

        System.out.println("canPermutePalindrome() = " + canPermutePalindrome("carerac"));

    }

    public static boolean canPermutePalindrome(String s) {

        int[] freqs = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freqs[s.charAt(i) - 'a']++;
        }

        boolean oddFreq = false;

        for (int j = 0; j < freqs.length; j++) {
            if (freqs[j] % 2 == 1) {
                if (oddFreq) {
                    return false;
                }
                oddFreq = true;
            }
        }

        return true;
    }


}