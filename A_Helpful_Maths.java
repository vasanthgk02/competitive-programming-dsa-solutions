import java.util.*;

public class A_Helpful_Maths {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if (str.length() == 1) {
            System.out.println(str);
            sc.close();
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ones = 0, twos = 0, threes = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                ones++;
            } else if (str.charAt(i) == '2') {
                twos++;
            } else if (str.charAt(i) == '3') {
                threes++;
            }
        }
        while (ones-- != 0) {
            sb.append("1+");
        }
        while (twos-- != 0) {
            sb.append("2+");
        }
        while (threes-- != 0) {
            sb.append("3+");
        }

        sb = sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
        sc.close();

    }

}