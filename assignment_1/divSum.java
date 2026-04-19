class A {
    int sumDivby7() {
        int s = 0;
        for (int i = 100; i < 200; i++) {
            if (i % 7 == 0) {
                s += i;
                // System.out.println(i);
            }
        }
        return s;
    }
}

public class divSum {
    public static void main(String[] args) {
        int res;
        A obj = new A();
        res = obj.sumDivby7();
        System.out.println("Sum of integers divisible by 7 (b/w 100 and 200): " + res);
    }
}
