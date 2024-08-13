package l2practiceeval2;

/*
			3. Given an array and a threshold value find the o/p
			Sample Input-1
			{5,8,10,13,6,2}
			threshold = 3
			Sample Output-1
			count = 17
			Explanation:
			Number parts 		counts
			5 		{3,2} 		2
			8 		{3,3,2} 	3
			10 		{3,3,3,1} 	4
			13 		{3,3,3,3,1} 5
			6 		{3,3} 		2
			2 		{2} 		1
 */


public class ArrayThreshold {
	
	public static void main(String[] args) {
        int[] arr = {5, 8, 10, 13, 6, 2};
        int threshold = 3;
        int count = countParts(arr, threshold);
        System.out.println("count = " + count); // Output: count = 17
    }

    public static int countParts(int[] arr, int threshold) {
        int totalParts = 0;

        for (int num : arr) {
            int parts = 0;
            while (num > 0) {
                parts += num / threshold;
                num = num % threshold;
                if (num > 0) {
                    parts += 1;
                    num = 0; 
                }
            }
            totalParts += parts;
        }

        return totalParts;
    }

}
