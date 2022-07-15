import java.util.*;

public class count_1_sorted_array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 1) {
                if (mid - 1 >= 0 && arr[mid - 1] == 1) {
                    high = mid - 1;
                    continue;
                }
                System.out.println("Number of 1s is " + (arr.length - mid));
                break;
            } else {
                low = mid + 1;
            }
        }
        sc.close();
    }

}