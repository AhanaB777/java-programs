// after java 17+ we can use nextInt(min, max +1);

import java.util.Random;

class A {
    int getRandomNum() {
        int n;
        Random r = new Random();
        n = r.nextInt(1, 101);
        return n;

    }
}

public class randomNum {
    public static void main(String[] args) {
        int n;
        A obj = new A();
        n = obj.getRandomNum();
        System.out.println(n);
    }
}
