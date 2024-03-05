import java.util.Scanner;

public class prefixSum1 {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void prefixSumArray(int arr[]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            arr[i] = s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements in the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before prefix sum : ");
        printArray(arr);

        prefixSumArray(arr);

        System.out.print("After prefix sum : ");
        printArray(arr);

        sc.close();
        
    }
}
