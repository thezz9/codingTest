import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] result = new int[n + m];

        System.arraycopy(arr, 0, result, 0, n);

        for (int i = n; i < n + m; i++) {
            result[i] = sc.nextInt();
        }

        Arrays.sort(result);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}