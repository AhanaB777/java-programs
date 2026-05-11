
/* Write a function to find the longest common prefix string amongst an array of strings. 
If there is no common prefix, return an empty string "". 
Example 1: 
Input: strs = ["flower","flow","flight"] 
Output: "fl" 
Example 2: 
Input: strs = ["dog","race","car"] 
Output: "" 
Explanation: There is no common prefix among the input strings. */

class A {
    String findPrefix(String s[]) {
        String res = "";
        for (int i = 0; i < s[0].length(); i++) {
            char var = s[0].charAt(i);
            for (int j = 1; j < s.length; j++) {
                if (s[j].charAt(i) != var || i > s.length) {
                    return res;
                }
            }
            res = res + var;
        }

        return res;
    }

}

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        A obj = new A();
        String res = obj.findPrefix(strs);
        System.out.println("Longest Common Prefix: " + res);

    }

}
