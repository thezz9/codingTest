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
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean isPeak = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (arr[nx][ny] >= arr[i][j]) {
                        isPeak = false;
                        break;
                    }
                }
                if (isPeak) result++;
            }
        }

        System.out.println(result);
    }
}