import java.util.*;

public class A_YES_or_YES {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            String str = sc.next();
            str = str.toLowerCase();
            if (str.equals("yes"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();

    }

}