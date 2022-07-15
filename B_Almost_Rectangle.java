import java.util.*;

public class B_Almost_Rectangle {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            char arr[][] = new char[n][n];
            for (int i = 0; i < n; i++) {
                String temp = sc.next();
                arr[i] = temp.toCharArray();
            }
            int i1 = 0, i2 = 0, j1 = 0, j2 = 0;
            int count = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == '*') {
                        if (count == 1) {
                            i1 = i;
                            j1 = j;
                        } else {
                            i2 = i;
                            j2 = j;
                            break;
                        }
                        count++;
                    }
                }
            }
            // for(char ch[] : arr){
            // for(char c : ch){
            // System.out.print(c);
            // }
            // System.out.println();
            // }
            // System.out.println(i1 + " " + j1 + "\n" + i2 + " " + j2);
            // System.out.println();
            if (i1 == i2) {
                if (i1 + 1 < n && i2 + 1 < n) {
                    arr[i1 + 1][j1] = '*';
                    arr[i2 + 1][j2] = '*';
                } else {
                    arr[i1 - 1][j1] = '*';
                    arr[i2 - 1][j2] = '*';
                }
            } else if (j1 == j2) {
                if (j1 + 1 < n && j2 + 1 < n) {
                    arr[i1][j1 + 1] = '*';
                    arr[i2][j2 + 1] = '*';
                } else {
                    arr[i1][j1 - 1] = '*';
                    arr[i2][j2 - 1] = '*';
                }
            } else {
                arr[i2][j1] = '*';
                arr[i1][j2] = '*';
            }
            for (char ch[] : arr) {
                for (char c : ch) {
                    System.out.print(c);
                }
                System.out.println();
            }

        }

        sc.close();

    }

}
