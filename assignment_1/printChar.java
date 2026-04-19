class A {
    void charPrint() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }
    }
}

public class printChar {
    public static void main(String[] args) {
        A obj = new A();
        obj.charPrint();

    }
}
