
//Program to print sequence "0,2,1,4,1,8,2,16,3,32,5,64,8,..." upto a given limit
import java.util.*;

class second {
    void printSequence(int limit) {
        int a = -1;
        int b = 1;
        int c;
        int p = 1;
        for (int i = 1; i <= limit / 2; i++) {
            c = a + b;

            System.out.print(c + "," + (int) Math.pow(2, p) + ",");
            p += 1;
            a = b;
            b = c;
        }
    }
}

class sequence1 {
    public static void main(String[] args) {
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        l = sc.nextInt();
        second obj = new second();
        obj.printSequence(l);
        sc.close();
    }
}