//Find last repeating element in the given array
public class LastRepeatingElement {
    static int lastRepeatingNumber(int arr[]) {
        int x = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    x = arr[i];
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 3, 1, 4, 2 };
        System.out.println(lastRepeatingNumber(arr));
    }
}
