package l2;
/*
5. Given a positive integer n, return the nth term of the count-and-say sequence.
Example 1: For example, the saying and conversion for digit string "3322251":- 3322251 - given
two 3's, three 2's, one 5 and one 1
23+32+15+11
23321511
Example 2:
1211
one 1, one 2,two 1's
11+12+21
111221

Starting Time : 14:54
Ending Time : 15:28
 */
public class Counting {	
  
    public String count(String s) {
 
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }

        result.append(count).append(s.charAt(s.length() - 1));

        return result.toString();
    }

    public static void main(String[] args) {
    	Counting solution = new Counting();

        // Test cases
        String input1 = "3322251";
        System.out.println(solution.count(input1)); // Output: "23321511"

        String input2 = "1211";
        System.out.println(solution.count(input2)); // Output: "111221"
    }
}
