import java.util.*;

class Missing_Number {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();
        int n = sc.nextInt();
        int count = n - 1;
        while (count != 0) {
            h.add(sc.nextInt());
            count--;
        }
        for (int i = 1; i <= n; i++) {
            if (!h.contains(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

}