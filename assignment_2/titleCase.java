
/*
Q9.  Convert Sentence to Title Case 
Problem Statement: 
A content editing software needs a function to convert a sentence into title case 
(i.e., the first letter of each word should be uppercase).

Example Input/Output: 
Input: 
Enter sentence: java programming is fun 
Output: 
Title Case: Java Programming Is Fun

*/
import java.util.Scanner;

class tcase {
    String makeTitleCase(String s) {
        String[] arr = s.split(" ");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
        }
        return res;
    }
}

public class titleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String s = sc.nextLine();

        tcase obj = new tcase();

        String res = obj.makeTitleCase(s);
        System.out.println("Title Case: " + res);

        sc.close();

    }
}
