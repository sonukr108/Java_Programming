import java.util.Scanner;

public class sortEvenAndOdd1 {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] sortEvenAndOdd(int arr[]) {
        int i, j = 0;
        int n = arr.length;
        int arr1[] = new int[n];
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr1[j++] = arr[i];
            }
        }
        for (int k = 0; k < n; k++) {
            if (arr[k] % 2 != 0) {
                arr1[j++] = arr[k];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter values in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sorting : ");
        printArray(arr);

        int arr1[] = sortEvenAndOdd(arr);

        System.out.print("After Sorting : ");
        printArray(arr1);
        sc.close();
    }
}
