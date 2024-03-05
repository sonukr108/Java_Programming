import java.util.Scanner;

public class arrayQuestions {

    static int countOcurrence(int arr[], int x) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter elements in " + a + " size of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Find ocurrence of which element : ");
        int x = sc.nextInt();
        System.out.print("The number of ocurrence of " + x + " element is : " + countOcurrence(arr, x));

        
    }
}
