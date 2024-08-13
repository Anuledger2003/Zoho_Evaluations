package l2practiceeval2;

/*
 	4. Find if a String2 is substring of String1. If it is, return the index of the
	first occurrence. else return -1.
	Sample Input-1
	thistest123string123
	123
	Sample Output-1
	8
==================================
 */


public class SubString {
	 public static void main(String[] args) {
	        String string = "thistest123string123";
	        String subString = "123";
	        
	        int index = findIndex(string, subString);
	        System.out.println(index);  
	    }

	    public static int findIndex(String string, String subString) {
	        int n = string.length();
	        int m = subString.length();

	        if (m > n) return -1;

	        for (int i = 0; i <= n - m; i++) {
	            int j;
	            for (j = 0; j < m; j++) {
	                if (string.charAt(i + j) != subString.charAt(j)) {
	                    break;
	                }
	            }
	            if (j == m)  return i;
	        }
	        return -1;
	    }

}

