import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        int rowSum, colSum;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            rowSum = colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += nums[i][j];
                colSum += nums[j][i];
            }
            maxSum = Math.max(maxSum, rowSum);
            maxSum = Math.max(maxSum, colSum);
        }

        rowSum = colSum = 0;
        for (int i = 0; i < n; i++) {
            rowSum += nums[i][i];
            colSum += nums[i][n - i - 1];
        }
        maxSum = Math.max(maxSum, rowSum);
        maxSum = Math.max(maxSum, colSum);

        System.out.println(maxSum);
    }
}