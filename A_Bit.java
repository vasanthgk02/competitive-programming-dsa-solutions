import java.util.*;

public class A_Bit {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int ans = 0;
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("X++", 1);
        mp.put("++X", 1);
        mp.put("X--", -1);
        mp.put("--X", -1);
        while (t-- != 0) {
            String str = sc.next();
            ans += mp.get(str);
        }
        System.out.println(ans);

        sc.close();

    }

}