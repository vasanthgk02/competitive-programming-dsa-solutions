import java.util.*;

public class A_Theatre_Square {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();
        int a = sc.nextInt();
        double ans = Math.ceil(m / a) * Math.ceil(n / a);
        System.out.println(ans);

        sc.close();
    }

}