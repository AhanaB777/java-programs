
import java.util.*;

class second {
    // int a;

    int update(int n) {
        return n * 5;
    }
}

class upDemo {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int: ");
        x = sc.nextInt();
        second obj = new second();
        y = obj.update(x);
        System.out.println("Updated Value: " + y);
        sc.close();
    }
}

