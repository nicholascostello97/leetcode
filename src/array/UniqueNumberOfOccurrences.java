package array;

import java.util.*;

/**
 Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 Example 1:
 Input: arr = [1,2,2,1,1,3]
 Output: true
 Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

 Example 2:
 Input: arr = [1,2]
 Output: false

 Example 3:
 Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 Output: true
 */
public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {

        System.out.println("uniqueOccurrences() = " + uniqueOccurrences(new int[]{1,2,2,1,1,3}));

        System.out.println("uniqueOccurrences() = " + uniqueOccurrences(new int[]{1,2}));

        System.out.println("uniqueOccurrences() = " + uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));

    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numToFreq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            numToFreq.computeIfPresent(arr[i], (key, val) -> val + 1);
            numToFreq.computeIfAbsent(arr[i], val -> 1);
        }

        Set<Integer> freqCounts = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : numToFreq.entrySet()) {
            if (freqCounts.contains(entry.getValue())) {
                return false;
            }
            freqCounts.add(entry.getValue());
        }

        return true;
    }
}