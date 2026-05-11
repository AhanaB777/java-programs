
/*
Q5. Anagram Check 
Given two strings s and t, return true if t is an anagram of s, and false otherwise.  
Given two strings s and t, return true if t is an anagram of s, and false otherwise. 
Example 1: 
Input: s = "anagram", t = "nagaram" 
Output: true 
Example 2: 
Input: s = "rat", t = "car" 
Output: false 
*/
import java.util.Scanner;
import java.util.Arrays;

class anagram {
    Boolean isAnagram(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        if (Arrays.equals(aa, bb)) {
            return true;
        } else {
            return false;
        }
    }
}

public class anagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String a = sc.next();
        System.out.println("Enter second string: ");
        String b = sc.next();

        anagram obj = new anagram();
        Boolean res = obj.isAnagram(a, b);
        System.out.println("Output: " + res);

        sc.close();

    }
}
