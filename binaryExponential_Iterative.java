import java.util.*;

public class binaryExponential_Iterative {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), ans = 1;
        if (b == 0) {
            System.out.println(1);
        } else {
            while (b != 0) {
                if ((b & 1) == 1) {
                    ans = ans * a;
                }
                b = b >> 1;
                a = a * a;
            }
            System.out.println(ans);
        }
        sc.close();
    }

}