import java.util.Scanner;

/*
Q2. Password Checker 
You are given a function. 
int CheckPassword(char str[], int n); 
The function accepts string str of size n as an argument. 
Implement the function which returns 1 if given string str is valid password else 0. 
str is a valid password if it satisfies the below conditions.
    – At least 4 characters
    – At least one numeric digit
    – At Least one Capital Letter
    – Must not have space or slash (/)
    – Starting character must not be a number
Assumption: Input string will not be empty. 
Example: 
Input: 
aA1_67 
Output: 
1 
Sample Input: 
a987 abC012 
Output: 
0

*/
class p {
    int CheckPassword(String s, int n) {

        if (n < 4) {
            System.out.println("Password must be atleast 4 characters");
            return 0;
        }
        char f = s.charAt(0);
        if (Character.isDigit(f)) {
            System.out.println("Password cannot begin with digit");
            return 0;
        }
        boolean dig = false;
        boolean cap = false;
        for (int i = 0; i < n; i++) {
            char var = s.charAt(i);
            if (var == ' ' || var == '/') {
                System.out.println("Invalid use of character");
                return 0;
            }

            if (Character.isDigit(var)) {
                dig = true;
            }
            if (Character.isUpperCase(var)) {
                cap = true;
            }
        }
        if (cap && dig) {
            return 1;
        } else {
            System.out.println("Password must contain atleast one capital letter and one digit");
            return 0;
        }
    }
}

public class passwordChecker {
    public static void main(String[] args) {
        String str;
        int n, res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        str = sc.nextLine();
        n = str.length();

        p obj = new p();
        res = obj.CheckPassword(str, n);

        System.out.println("Output: " + res);

        sc.close();
    }
}
