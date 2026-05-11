import java.util.Scanner;

class A {
    int[][] getInput() {
        int a[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element " + (i + 1) + "," + (j + 1) + " : ");
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return a;
    }

    void dispArr(int a[][]) {
        System.out.println("Array elements are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    void findRowSum(int a[][]) {
        int res[] = new int[3];
        for (int i = 0; i < 3; i++) {
            res[i] = a[i][0] + a[i][1] - a[i][2];
        }
        System.out.println("Resulted Array: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

public class rowSumArray {
    public static void main(String[] args) {
        int[][] arr;
        A obj = new A();
        arr = obj.getInput();
        obj.dispArr(arr);
        obj.findRowSum(arr);
    }
}
