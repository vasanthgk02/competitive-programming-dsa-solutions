import java.util.*;

public class A_Vanya_and_Fence {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt(), ans = 0;
        while (n1-- != 0) {
            int temp = sc.nextInt();
            if (temp > n2)
                ans += 2;
            else
                ans += 1;
        }
        System.out.println(ans);
        sc.close();

    }

}