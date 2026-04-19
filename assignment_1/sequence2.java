
//Program to print sequence "0, -1, 1, -4, 1, -7, 2, -10, 3, -13,..." upto a limit
import java.util.*;

class A {
    void printSequence2(int limit) {
        int a = -1;
        int b = 1;
        int c;
        int d = -1;
        for (int i = 1; i <= limit / 2; i++) {
            c = a + b;
            System.out.print(c + "," + d + ",");
            d -= 3;
            a = b;
            b = c;
        }
    }
}

class sequence2 {
    public static void main(String[] args) {
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        l = sc.nextInt();
        A obj = new A();
        obj.printSequence2(l);
        sc.close();

    }
}
