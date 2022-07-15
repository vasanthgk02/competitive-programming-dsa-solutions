import java.util.*;

public class A_Boy_or_Girl {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[26];
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int x : arr) {
            if (x > 0)
                count++;
        }
        if (count % 2 == 0)
            System.out.print("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

        sc.close();

    }

}