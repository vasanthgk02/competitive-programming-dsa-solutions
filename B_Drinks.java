import java.util.*;

public class B_Drinks {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(), d = t;
        double ans = 0;
        while (t-- != 0) {
            int n = sc.nextInt();
            ans = ans + (n / 100.0);
        }

        System.out.println((ans / d) * 100.0);
        sc.close();

    }

}