import java.util.*;

public class A_Next_Round {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int score = arr[k - 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] >= score)
                ans++;
        }

        System.out.println(ans);
        sc.close();

    }

}