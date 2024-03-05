//Find first repeating element in the given array
public class FirstRepeatingElement {
    static int firstRepeatingNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 3 };
        System.out.println(firstRepeatingNumber(arr));
    }
}
