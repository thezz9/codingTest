import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i + 1][j + 1] = sc.nextInt();
            }
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int t = arr[i][j];
                if (t > arr[i - 1][j] &&
                    t > arr[i + 1][j] &&
                    t > arr[i][j - 1] &&
                    t > arr[i][j + 1]
                ) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}