import java.util.*;

public class BubbleSort {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Integer arr[] = { 5, 4, 2, 3, 4, 1, 34, 0 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Integer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

}