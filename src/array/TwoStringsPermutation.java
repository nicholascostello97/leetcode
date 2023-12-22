package array;

/**
 Given two string, write a method to determine if one string is a permutation of another.

 Example 1:
 Input: n = "ABCD" m = "DABC"
 Output: true

 Example 2:
 Input: n = "ABCDE" m = "DABCA"
 Output: false

 */
public class TwoStringsPermutation {
    public static void main(String[] args) {

        System.out.println("areStringPermutations() = " + areStringPermutations("ABCDEFGH", "ADBEFGHC"));

        System.out.println("areStringPermutations() = " + areStringPermutations("QWERTY", "QWERTYY"));

        System.out.println("areStringPermutations() = " + areStringPermutations("EEEQQQQEQEQEEQ", "EEEEEEEQQQQQQQ"));

    }

    /**

     Questions to consider:
     1. Is input all lower/uppercase?
        If not, prefer to use a map since its more logic to use an array that handles both lowercase and uppercase
        frequencies, and we always know the map will be constrained by size 52 [A-Z,a-z].

     */
    public static boolean areStringPermutations(String n, String m) {
        int[] freqs = new int[26];

        for (int i = 0; i < n.length(); i++) {
            freqs[n.charAt(i) - 'A']++;
        }

        for (int j = 0; j < m.length(); j++) {
            freqs[m.charAt(j) - 'A']--;
        }

        for (int k = 0; k < freqs.length; k++) {
            if (freqs[k] != 0) return false;
        }

        return true;
    }


}