import java.util.*;

public class Binary_Search {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 30, 40, 50 };
        int x = 20;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                if (mid - 1 >= 0 && arr[mid - 1] == x) {
                    right = mid - 1;
                    continue;
                }
                System.out.println("Element Found at " + mid);
                break;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        sc.close();

    }

}