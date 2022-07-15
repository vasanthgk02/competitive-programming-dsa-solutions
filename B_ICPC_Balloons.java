import java.util.*;

public class B_ICPC_Balloons {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();
            HashSet<Character> hs = new HashSet<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (hs.contains(str.charAt(i))) {
                    ans++;
                } else {
                    ans += 2;
                    hs.add(str.charAt(i));
                }
            }
            System.out.println(ans);
        }

        sc.close();

    }

}