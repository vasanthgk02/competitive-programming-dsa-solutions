import java.util.*;

public class A_Petya_and_Strings {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(), str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean flag = true;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) - str2.charAt(i) != 0) {
                if (str1.charAt(i) - str2.charAt(i) < 0) {
                    System.out.println("-1");
                } else if (str1.charAt(i) - str2.charAt(i) > 0) {
                    System.out.println("1");
                }
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("0");
            ;
        }
        sc.close();

    }

}