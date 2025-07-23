import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int iRank = 0, jRank = 0;
                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) iRank = l;
                        if (arr[k][l] == j) jRank = l;
                    }
                    if (iRank < jRank) cnt++;
                }
                if (cnt == m) result++;
            }
        }

        System.out.println(result);
    }
}