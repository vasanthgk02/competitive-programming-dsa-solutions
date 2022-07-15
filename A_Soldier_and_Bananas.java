import java.util.*;

public class A_Soldier_and_Bananas {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();
        int ans = w * (w + 1);
        ans = (int) Math.floor(ans / 2);
        ans = ans * k;
        if (n > ans)
            System.out.println(0);
        else
            System.out.println(Math.abs(ans - n));
        sc.close();

    }

}