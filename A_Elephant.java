import java.util.*;

public class A_Elephant {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 5;
        int ans = 0;
        while (n != 0) {
            if (n - count >= 0) {
                n -= count;
                ans++;
            } else
                count--;
        }
        System.out.println(ans);

        sc.close();

    }

}