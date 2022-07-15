import java.util.*;

public class C_Cypher {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int step[] = new int[n];
            String moves[] = new String[n];
            for (int i = 0; i < n; i++) {
                step[i] = sc.nextInt();
                moves[i] = sc.next();
            }
            for (int i = 0; i < moves.length; i++) {
                for (int j = 0; j < moves[i].length(); j++) {
                    if (moves[i].charAt(j) == 'U') {
                        if (arr[i] == 0)
                            arr[i] = 9;
                        else
                            arr[i] = (arr[i] - 1) % 10;
                    } else {
                        arr[i] = (arr[i] + 1) % 10;
                    }
                }
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();

    }

}