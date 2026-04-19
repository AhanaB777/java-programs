import java.util.Scanner;

class A {
    boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void sumofPrimes(int n) {
        for (int i = 1; i < n / 2; i++) {
            if (isPrime(i) && isPrime((n - i))) {
                System.out.println("Yes " + i + " and " + (n - i) + " make " + n);
                break;
            }
        }

    }
}

public class sumPrimes {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        A obj = new A();
        obj.sumofPrimes(n);
        sc.close();
    }
}
