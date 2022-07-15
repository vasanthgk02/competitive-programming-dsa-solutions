import java.util.*;

public class selectionSort {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 3, 4, 34, 123, 4, 34 };
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}