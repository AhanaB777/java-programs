import java.util.*;

class F {
    int fact(int n) {
        int f = 1;
        for (int i = n; i >= 1; i--) {
            f *= i;
        }
        return f;
    }
}

class factorial {
    public static void main(String[] args) {
        int num, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of num: ");
        num = sc.nextInt();
        F obj = new F();
        x = obj.fact(num);
        System.out.println("Factorial of number is " + x);
        sc.close();
    }
}
