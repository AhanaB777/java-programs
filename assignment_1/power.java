import java.util.Scanner;

class pwr {
    int calcPow(int x, int y) {
        int r = 1;
        for (int i = 1; i <= y; i++) {
            r *= x;
        }
        return r;
    }
}

class power {
    public static void main(String[] args) {
        int x, y, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number : ");
        x = sc.nextInt();
        System.out.println("Enter value of power: ");
        y = sc.nextInt();
        pwr obj = new pwr();
        res = obj.calcPow(x, y);
        System.out.println("Result : " + res);
        sc.close();
    }
}
