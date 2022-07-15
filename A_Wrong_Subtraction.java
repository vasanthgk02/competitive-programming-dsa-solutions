import java.util.*;

public class A_Wrong_Subtraction {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt();
        while (n2-- != 0) {
            int ld = n1 % 10;
            if (ld == 0) {
                n1 /= 10;
            } else {
                n1--;
            }
        }
        System.out.println(n1);
        sc.close();

    }

}