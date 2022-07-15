import java.util.*;

public class insertionSort {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 23, 432, 4, 23, 4, 123, 4, 234 };
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int index = i - 1;
            while (index >= 0 && arr[index] > key) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();

    }

}