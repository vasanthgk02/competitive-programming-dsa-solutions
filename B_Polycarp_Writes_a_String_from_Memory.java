import java.util.*;

public class B_Polycarp_Writes_a_String_from_Memory {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            String str = sc.next();
            if (str.length() <= 3) {
                System.out.println(1);
                continue;
            }
            HashSet<Character> hs = new HashSet<>();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (hs.contains(str.charAt(i))) {
                    continue;
                } else if (hs.size() == 3) {
                    count++;
                    hs.clear();
                }
                hs.add(str.charAt(i));
            }
            if (!hs.isEmpty())
                count++;
            System.out.println(count);
        }
        sc.close();
    }

}