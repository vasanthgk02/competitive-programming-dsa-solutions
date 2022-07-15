import java.util.*;

public class A_Round_Down_the_Price {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long tens = 1;
            int temp = n;
            while (temp != 0) {
                tens = tens * 10;
                temp /= 10;
            }
            tens /= 10;
            System.out.println(((long) n) - tens);
        }

        sc.close();

    }

}