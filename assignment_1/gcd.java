import java.util.Scanner;

class A {
    int findGCD(int a, int b) {
        int rem;
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            rem = a % b;
            if (rem == 0) {
                return b;
            } else {
                a = b;
                b = rem;
            }
        }
        return b;
    }
}

class gcd {
    public static void main(String[] args) {
        int x, y, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        x = sc.nextInt();
        System.out.println("Enter the second number: ");
        y = sc.nextInt();
        A obj = new A();
        res = obj.findGCD(x, y);
        System.out.println("GCD : " + res);
        sc.close();
    }
}
