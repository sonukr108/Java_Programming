import java.util.Scanner;

public class arrayInRoration {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapArray(int arr[], int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    static void reverseArray(int arr[], int i, int j) {

        while (i < j) {
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInArray(int arr[], int k) {
        int n =arr.length;
        reverseArray(arr, 0,(n-k-1));
        reverseArray(arr, (n-k), (n-1));
        reverseArray(arr, 0, (n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.print("Enter no. of roatation : ");
        int k = sc.nextInt();
        k = k % arr.length;
        System.out.print("Before rotation : ");
        printArray(arr);
        rotateInArray(arr, k);
        System.out.print("After rotation : ");
        printArray(arr);
        sc.close();
    }
}
