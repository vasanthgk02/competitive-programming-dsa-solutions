import java.util.*;

public class Binary_Search_Recursive {

    public static int binarySearch(int arr[], int left, int right, int key) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {

                // To find first occurence of the key
                if (mid - 1 >= 0 && arr[mid - 1] == key) {
                    return binarySearch(arr, left, mid - 1, key);
                }

                return mid;
            } else if (arr[mid] > key)
                return binarySearch(arr, left, mid - 1, key);
            else if (arr[mid] < key)
                return binarySearch(arr, mid + 1, right, key);
        }
        return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 30, 40, 50 };
        System.out.println(binarySearch(arr, 0, arr.length - 1, 20));
        sc.close();

    }

}