package l2practiceeval2;

/*
	5. You are given an integer array nums consisting of 2 * n integers.
	You need to divide nums into n pairs such that:
	Each element belongs to exactly one pair.
	The elements present in a pair are equal.
	Return true if nums can be divided into n pairs, otherwise return false.
	Example 1:
	Input: nums = [3,2,3,2,2,2]
	Output: true
	Explanation:
	There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
	If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy
	all the conditions.
	Example 2:
	Input: nums = [1,2,3,4]
	Output: false
	Explanation:
	There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy
	every condition.
	Constraints:
	nums.length == 2 * n
	1 <= n <= 500
	1 <= nums[i] <= 500
 */


public class PairArray {
	public static void main(String[] args) {
        int[] nums1 = {3, 2, 3, 2, 2, 2};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println(PairElementInArray(nums1)); 
        System.out.println(PairElementInArray(nums2)); 
    }

    public static boolean PairElementInArray(int[] nums) {
        selectionSort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return false; 
            }
        }
        return true; 
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}





