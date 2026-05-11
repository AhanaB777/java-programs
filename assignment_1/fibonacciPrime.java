
class fibP {
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

    void Fibonacci() {
        int a = -1;
        int b = 1;
        int c;
        int co = 1;
        for (int i = 0; i < 1000; i++) {
            c = a + b;
            int num = c;
            if (isPrime(num) && co <= 8) {
                System.out.println(num);
                co += 1;
            }

            a = b;
            b = c;
        }
    }
}

class fibonacciPrime {
    public static void main(String[] args) {
        // int x, y;
        fibP obj = new fibP();
        obj.Fibonacci();

    }
}
