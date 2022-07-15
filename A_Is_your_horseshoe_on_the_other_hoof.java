import java.util.*;

public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt(), n4 = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        s.add(n1);
        s.add(n2);
        s.add(n3);
        s.add(n4);
        System.out.println(4 - s.size());

        sc.close();

    }

}