
/*
Q6. Replace Profanity in Text 
Problem Statement: 
A social media platform wants to automatically replace offensive words with *** in user-generated content
Given a list of bad words, replace them in the input text.

Example Input/Output: 
Bad Words List: "bad", "ugly", "stupid" 
Input: 
Enter text: This is a bad and ugly comment. 
Output: 
Filtered text: This is a *** and *** comment.

*/
import java.util.Scanner;

class rp {
    String replace(String s, String[] badWords) {
        for (int i = 0; i < badWords.length; i++) {
            s = s.replace(badWords[i], "***");
        }
        return s;
    }
}

public class replaceProfanity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter comment: ");
        String s = sc.nextLine();
        String badWords[] = { "bad", "ugly", "stupid" };

        rp obj = new rp();
        String res = obj.replace(s, badWords);

        System.out.println("Filtered Text: " + res);

        sc.close();
    }
}
