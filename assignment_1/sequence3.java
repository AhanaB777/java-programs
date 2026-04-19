
// Program to print sequence "2, 1, 4, 2, 6, 6, 8, 24, 10, ...." upto a given limit
// 1, 2, 6, 24, 
import java.util.Scanner;

class A {
    void printSequence3(int limit) {
        // int a = 2;
        int b = 1;
        int m = 1;
        for (int i = 1; i <= limit / 2; i++) {
            System.out.print(2 * m + ", " + b * m + ", ");
            b = b * m;
            m += 1;
        }
    }
}

class sequence3 {
    public static void main(String[] args) {
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        l = sc.nextInt();
        A obj = new A();
        obj.printSequence3(l);
        sc.close();
    }
}
