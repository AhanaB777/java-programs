/* Q3. Letter Combinations of a Phone Number 
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could 
represent. Return the answer in any order. 
A mapping of digit to letters (just like on the telephone buttons) is given below. 
Note that 1 does not map to any letters.

Example 1: 
Input: digits = "23" 
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2: 
Input: digits = "" 
Output: [] 

Example 3: 
Input: digits = "2" 
Output: ["a","b","c"] */

import java.util.Scanner;

class lc {
    void possibleCombination(String digits) {
        if (digits.length() == 0) {
            System.out.println("[]");
            return;
        }
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        find(digits, "", map);
    }

    void find(String digits, String res, String[] map) {
        if (digits.length() == 0) {
            System.out.println(res);
            return;
        }
        int num = digits.charAt(0) - '0';
        String letters = map[num];
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            find(digits.substring(1), res + ch, map);
        }
    }
}

public class letterComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number (2-9): ");
        String s = sc.nextLine();

        lc obj = new lc();

        obj.possibleCombination(s);

        sc.close();
    }
}
