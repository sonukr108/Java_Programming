import java.util.Scanner;

public class PresentQuery {

    static int[] makeFrequencyArray(int arr[]) {
        int newArray[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            newArray[arr[i]]++;
        }
        return newArray;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 2, 6, 5, 8, 18 };
        int q;
        int newArray[] = makeFrequencyArray(arr);
        printArray(newArray);
        System.out.println("All the elements are present in array are less than 100");
        System.out.print("Enter no. of queries : ");
        q = sc.nextInt();

        // Answer the questions
        while (q > 0) {
            System.out.print("Enter element do you want to search : ");
            int x = sc.nextInt();
            if (newArray[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }
        sc.close();
    }
}
