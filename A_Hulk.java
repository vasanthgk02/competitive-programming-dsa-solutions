import java.util.*;

public class A_Hulk {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = "I hate it ", str2 = "I hate that ", str3 = "I love it ", str4 = "I love that ";
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (n == 1) {
            System.out.println(str);
            sc.close();
            return;
        }
        int count = 1;
        while (count != n) {
            if ((count & 1) == 1)
                sb.append(str2);
            else
                sb.append(str4);
            count++;
        }
        if ((n & 1) == 1)
            sb.append(str);
        else
            sb.append(str3);
        System.out.println(sb);
        sc.close();

    }

}