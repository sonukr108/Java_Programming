//Sum of all elements in a array
public class SumArrays {

    public static void main(String[] args) {
        int i, s = 0, arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }
}