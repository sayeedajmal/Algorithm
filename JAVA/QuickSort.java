import java.util.Scanner;
public class QuickSort {
    static int max = 11;
    static int a[] = new int[max];

    public static void qsort(int a[], int low, int high) {
        int j;
        if (low < high) {
            j = partition(a, low, high);
            qsort(a, low, j - 1);
            qsort(a, j + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot, i, j, temp;
        pivot = a[low];
        i = low + 1;
        j = high;
        while (true) {
            while (pivot > a[i] && i <= high)
                i++;
            while (pivot < a[j])
                j--;
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            } else {
                temp = a[j];
                a[j] = a[low];
                a[low] = temp;
                return j;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[max];
        System.out.println("Enter the vlaue of N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The array Elements before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", a[i]);
        }
        qsort(a, 0, n - 1);
        System.out.println("\nElements of the array after sorting are:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", a[i]);
        }
        sc.close();
    }
}