import java.util.*;

public class A_Polycarp_and_Coins {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int ones = n / 3, twos = n / 3;
            if (n % 3 == 1) {
                ones += 1;
            } else if (n % 3 == 2) {
                twos += 1;
            }
            System.out.println(ones + " " + twos);
            t--;
        }
        sc.close();

    }

}