import java.util.Scanner;

class A {
    void isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (temp == rev)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

public class palindrome {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        A obj = new A();
        obj.isPalindrome(n);
        sc.close();
    }
}
