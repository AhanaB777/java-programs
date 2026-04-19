import java.util.Scanner;

class A {
    void dispFactors(int x) {
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(x);
    }
}

class factors {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        A obj = new A();
        System.out.println("Factors of " + num + " are : ");
        obj.dispFactors(num);
        sc.close();
    }
}
