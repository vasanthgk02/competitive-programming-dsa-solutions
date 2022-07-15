import java.util.*;

public class A_George_and_Accommodation {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int ans = 0;
        while (t-- != 0) {
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            if (n2 - n1 >= 2)
                ans++;
        }
        System.out.println(ans);
        sc.close();

    }

}