
/*
Q8.  Find the Longest Word 
Problem Statement: 
A book editor tool requires a function to find the longest word in a given sentence. 
Example Input/Output: 
Input: 
Enter sentence: Innovation distinguishes between a leader and a follower. 
Output: 
Longest Word: distinguishes 
*/
import java.util.Scanner;

class lw {
    String findLongestWord(String s) {
        String[] arr = s.split(" ");
        String l = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > l.length()) {
                l = arr[i];
            }
        }
        return l;
    }
}

public class longestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String s = sc.nextLine();

        lw obj = new lw();

        String res = obj.findLongestWord(s);
        System.out.println("Longest Word: " + res);

        sc.close();
    }
}
