import java.util.*;

public class A_Magnets {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String str = sc.next();
        t--;
        int count = 1;
        while (t-- != 0) {
            String temp = sc.next();
            if (str.equals(temp) != true) {
                count++;
            }
            str = temp;
        }
        System.out.println(count);
        sc.close();

    }

}