import java.util.*;

public class A_Tram {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int ans = 0, curr = 0;
        while (t-- != 0) {
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            curr = curr - n1 + n2;
            ans = (int) Math.max(ans, curr);
        }
        System.out.println(ans);
        sc.close();

    }

}