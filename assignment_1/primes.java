
class pr {

    void printPrimes() {
        for (int i = 2; i <= 1000; i++) {
            int num = i;
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count += 1;
                }
            }
            if (count <= 2) {
                System.out.println(num);
            }
        }
    }
}

class primes {
    public static void main(String[] args) {
        pr obj = new pr();
        obj.printPrimes();
    }
}
