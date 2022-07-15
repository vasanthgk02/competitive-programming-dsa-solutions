import java.util.*;

public class square_binary_search {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = 10;
        int low = 0, high = 10;
        while (low <= high) {
            int mid = (low + high) / 2;
            ;
            if (mid * mid <= num) {
                if (mid + 1 <= num & (mid + 1) * (mid + 1) <= num) {
                    low = mid + 1;
                    continue;
                }
                System.out.println("The square root of the number is " + mid);
                break;
            } else if (mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        sc.close();
    }

}