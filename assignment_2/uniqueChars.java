
/*
Q7.  Unique Characters in a String 
Problem Statement: 
A company is developing a new security system that requires checking whether a given string has all unique 
characters. You need to write a program that: 
 Accepts a string from the user. 
 Checks if all characters in the string are unique. 

Example Input/Output: 
Input 1: 
Enter a string: abcde 
Output 1: 
All characters are unique. 

Input 2: 
Enter a string: hello 
Output 2: 
String contains duplicate characters.
*/
import java.util.Scanner;

class uc {
    void isUniqueChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                char b = s.charAt(j);
                if (a == b) {
                    System.out.println("String contains duplicate characters");
                    return;
                }
            }
        }
        System.out.println("All characters are unique");
    }
}

public class uniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word: ");
        String s = sc.next();

        uc obj = new uc();

        obj.isUniqueChars(s);

        sc.close();
    }
}
