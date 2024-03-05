import java.util.Scanner;

public class sortEvenAndOdd2 {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    static void sortEvenAndOdd(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Sorting : ");
        printArray(arr);

        sortEvenAndOdd(arr);

        System.out.print("After Sorting : ");
        printArray(arr);

        sc.close();
    }
}
