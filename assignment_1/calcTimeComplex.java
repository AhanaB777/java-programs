class Search {
    int BinarySearch(int a[], int item) {
        int iter = 0, beg = 0, end = a.length - 1;
        while (beg <= end) {
            iter += 1;
            int mid = (beg + end) / 2;
            if (item == a[mid]) {
                break;
            } else if (item < a[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return iter;
    }

    int LinearSearch(int a[], int item) {
        int iter = 0;
        for (int i = 0; i < a.length; i++) {
            iter += 1;
            if (item == a[i]) {
                break;
            }
        }
        return iter;
    }
}

public class calcTimeComplex {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50 };
        int item = 45;
        System.out.println("Array elements are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        Search obj = new Search();
        int lin_it = obj.LinearSearch(a, item);
        System.out.println();
        System.out.println("Number of iterations of linear search: " + lin_it);

        int bin_it = obj.BinarySearch(a, item);
        System.out.println();
        System.out.println("Number of iterations of binary search: " + bin_it);
    }
}
