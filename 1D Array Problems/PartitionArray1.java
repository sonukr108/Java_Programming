import java.util.Scanner;

public class PartitionArray1 {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void prefixInArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    static boolean partitionArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == (arr[arr.length-1] - arr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + "value in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before prefix : ");
        printArray(arr);
        prefixInArray(arr);
        System.out.print("After prefix : ");
        System.out.println("Array of partition possible : " + partitionArray(arr));        
        sc.close();
    }
}