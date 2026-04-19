//Program to calculate: Sum of terms 1/1! + 1/2! + 1/3!.... upto n terms

import java.util.Scanner;

class A {
    double calculateSum(int limit) {
        double s = 0;
        int f = 1;
        for (int i = 1; i <= limit; i++) {
            f *= i;
            s += 1.0 / f;
        }

        return s;
    }
}

class sumTerms {
    public static void main(String[] args) {
        int n;
        double res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        A obj = new A();
        res = obj.calculateSum(n);
        System.out.println("Sum of terms : " + res);
        sc.close();
    }
}
