import java.util.*;

public class A_Anton_and_Danik {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        char arr[] = new char[t];
        int a = 0, d = 0;
        for (int i = 0; i < t; i++) {
            char c = sc.next().charAt(0);
            arr[i] = c;
            if (arr[i] == 'A')
                a++;
            else
                d++;
        }
        if (a == d)
            System.out.println("Friendship");
        else if (a > d)
            System.out.println("Anton");
        else
            System.out.println("Dankik");
        sc.close();

    }

}