package array;

import java.util.Arrays;

/**
 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 representing the number of elements in nums1 and nums2 respectively.

 Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */
public class MergeSortedArray {
    public static void main(String[] args) {

        int[] n1 = new int[]{1,2,3,0,0,0};
        int[] n2 = new int[]{2,5,6};

        merge(n1, 3, n2, 3);
        System.out.println("merge() = " + Arrays.toString(n1));
    }

    public static void merge(int[] n, int nLen, int[] m, int mLen) {
        int nIdx = nLen - 1;
        int mIdx = mLen - 1;
        int insertIdx = mLen + nLen - 1;
        
        while (nIdx >= 0 && mIdx >= 0) {
            if (n[nIdx] >= m[mIdx]) {
                n[insertIdx] = n[nIdx];
                nIdx--;
            } else {
                n[insertIdx] = m[mIdx];
                mIdx--;
            }
            insertIdx--;
        }

        while (nIdx >= 0) {
            n[insertIdx] = n[nIdx];
            nIdx--;
            insertIdx--;
        }

        while (mIdx >= 0) {
            n[insertIdx] = m[mIdx];
            mIdx--;
            insertIdx--;
        }
    }
}