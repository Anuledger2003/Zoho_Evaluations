package l2;

import java.util.Scanner;

/*
4. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
return the index where it would be if it were inserted in order.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 100
nums contains distinct values sorted in ascending order.
0 <= target <= 100
================
Starting Time : 14:33
Ending Time : 14:53
 */
public class TargetedIndex {
	    public int searchInsert(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] >= target) {
	                return i;
	            }
	        }
	        return nums.length;
	    }

    public static void main(String[] args) {
        TargetedIndex solution = new TargetedIndex();
        
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println(solution.searchInsert(nums1, target1));
        
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println(solution.searchInsert(nums2, target2)); 
        
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println(solution.searchInsert(nums3, target3));
    }

	
    }
