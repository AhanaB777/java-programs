/*
Q4. Java program to find all permutations of a given String using recursion. 
For example, given a String "XYZ", this program will print all 6 possible permutations
e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX
*/

import java.util.Scanner;

class P {
    void findPerm(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res + " ");
        }
        for (int i = 0; i < s.length(); i++) {
            char var = s.charAt(i);
            String s_var = s.substring(0, i) + s.substring(i + 1);
            findPerm(s_var, res + var);
        }
    }
}

public class strPerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.next();

        P obj = new P();
        String res = "";
        System.out.println("The permutations are: ");
        obj.findPerm(s, res);

        sc.close();
    }
}
