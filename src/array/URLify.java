package array;

import java.util.Arrays;

/**
 Given a string, replace underscores with '%20'. Do not use arrayList. You are given length of actual string.

 Example 1:
 Input: n = "Mr John Smith    ", 13
 Output: "Mr%20John%20Smith"

 */
public class URLify {
    public static void main(String[] args) {

        System.out.println("convertToURL() = " + Arrays.toString(convertToURL("Mr John Smith    ".toCharArray(), 13)));

        System.out.println("convertToURL() = " + Arrays.toString(convertToURL("A B  C   D    E                    ".toCharArray(), 15)));

        System.out.println("convertToURL() = " + Arrays.toString(convertToURL("            ".toCharArray(), 4)));

        System.out.println("convertToURL() = " + Arrays.toString(convertToURL("".toCharArray(), 0)));
    }

    public static char[] convertToURL(char[] n, int l) {

        int left = l - 1;
        int right = n.length - 1;

        while (left >= 0) {
            if (n[left] == ' ') {
                n[right--] = '0';
                n[right--] = '2';
                n[right--] = '%';
                left--;
            } else {
                n[right--] = n[left--];
            }
        }
        return n;
    }


}