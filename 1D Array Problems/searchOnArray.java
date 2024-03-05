public class searchOnArray {
    public static void main(String[] args) {
        int n = 6, i, temp = -1, arr[] = { 45, 4, 2, 41, 12, 25, 22, 36 };
        for (i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                temp = i;
                break;
            }
        }
        if (temp == -1) {
            System.out.println("Element is not found ");
        }
        else{
        System.out.println(n + " Found " + " at index " + temp);
        }
    }
}
