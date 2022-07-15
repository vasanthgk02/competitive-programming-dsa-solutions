import java.util.*;

public class A_Presents {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < t; i++)
            mp.put(sc.nextInt(), i + 1);
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            System.out.print(e.getValue() + " ");
        }
        sc.close();

    }

}