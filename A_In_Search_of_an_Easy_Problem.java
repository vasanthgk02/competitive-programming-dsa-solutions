import java.util.*;

public class A_In_Search_of_an_Easy_Problem {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        boolean flag = true;
        while (t-- != 0) {
            int temp = sc.nextInt();
            if (temp == 1) {
                System.out.println("HARD");
                flag = false;
                break;
            }
        }
        if (flag == true)
            System.out.println("EASY");
        sc.close();

    }

}