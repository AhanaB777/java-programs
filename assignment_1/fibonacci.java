
import java.util.*;

class Fib {
    int Fibonacci(int n) {
        int a = -1;
        int b = 1;
        int c;
        int s = 0;
        for (int i = 0; i < 10; i++) {
            c = a + b;
            System.out.println(c);
            s = s + c;
            a = b;
            b = c;
        }
        return s;
    }
}

class fibonacci {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number of terms: ");
        x = sc.nextInt();
        Fib obj = new Fib();
        y = obj.Fibonacci(x);
        System.out.println("Sum of terms: " + y);
        sc.close();
    }
}
