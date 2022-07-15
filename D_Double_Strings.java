import java.util.*;

public class D_Double_Strings {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            HashSet<String> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
                hs.add(arr[i]);
            }
            String ans = "";
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < arr[i].length(); j++) {
                    if (hs.contains(arr[i].substring(0, j)) && hs.contains(arr[i].substring(j, arr[i].length()))) {
                        ans += "1";
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans += "0";
                }
            }
            System.out.println(ans);
            // String ans = "";
            // HashSet<String> hs = new HashSet<>();
            // for(int i = 0; i < n; i++){
            // for(int j = 0; j < n; j++){
            // hs.add(arr[i] + arr[j]);
            // }
            // }
            // for(int i = 0; i < n; i++){
            // if(hs.contains(arr[i]))
            // ans = ans + "1";
            // else
            // ans = ans + "0";
            // }
            // System.out.println(ans);
            // for(String str : hs)
            // System.out.println(str);
        }

        sc.close();

    }

}