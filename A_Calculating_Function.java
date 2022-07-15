import java.util.*;

public class A_Calculating_Function {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(), temp = 0, ans = 0;
        if (n % 2 == 1) {
            temp = -n;
        }
        n /= 2;
        ans = n * n;
        ans = -ans;
        ans += 2 * ((n * (n + 1)) / 2);
        ans += temp;
        System.out.println(ans);
        sc.close();

    }

}
