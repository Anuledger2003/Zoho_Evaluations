package l2practiceeval2;

/*1. Given an array and an integer K, find the maximum for each and every
contiguous subarray of size K.
Example-1 :
Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
Output: 3 3 4 5 5 5 6
Explanation: Maximum of 1, 2, 3 is 3
Maximum of 2, 3, 1 is 3
Maximum of 3, 1, 4 is 4
Maximum of 1, 4, 5 is 5
Maximum of 4, 5, 2 is 5
Maximum of 5, 2, 3 is 5
Maximum of 2, 3, 6 is 6
Example-2 :
Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4
Output: 10 10 10 15 15 90 90
Explanation:
Maximum of first 4 elements is 10, similarly for next 4 elements
(i.e from index 1 to 4) is 10, So the sequence generated is 10 10 10 15 15 90 90
*/


public class SubArrayMax {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k1 = 3;
        subarrayMaxRecursive(a1, k1, 0);

        System.out.println();

        int a2[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k2 = 4;
        subarrayMaxRecursive(a2, k2, 0);
    }
    public static void subarrayMaxRecursive(int arr[], int key, int start) {
        int n = arr.length;
        if (start > n - key) {
            return; 
        }
        int max = arr[start];
        for (int i = start + 1; i < start + key; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max + " ");
        subarrayMaxRecursive(arr, key, start + 1);
    }
}
