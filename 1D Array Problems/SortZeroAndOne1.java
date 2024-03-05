import java.util.Scanner;

public class SortZeroAndOne1 {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void SortZeroesAndOnes(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        // 0 to Count : 0   and count to n : 1
        for (int i = 0; i < n; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of the array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " values in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Sorting : ");
        printArray(arr);
        SortZeroesAndOnes(arr);
        System.out.print("After Sorting : ");
        printArray(arr);
        sc.close();
    }
}
