import java.util.*;

public class A_Translation {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(), str2 = sc.next();
        boolean flag = true;
        if (str1.length() != str2.length()) {
            System.out.println("NO");
            sc.close();
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str1.length() - 1 - i)) {
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if (flag == true)
            System.out.println("YES");

        sc.close();

    }

}