import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int total = 0;
    static int half;
    static String answer = "NO";
    static boolean found = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        if ((total % 2) == 1) {
            System.out.println("NO");
            return;
        }

        half = total / 2;

        dfs(0, 0, arr);
        System.out.println(answer);
    }

    public static void dfs(int l, int sum, int[] arr) {
        if (found) return;
        if (sum > half) return;
        if (l == n) {
            if (sum == half) {
                answer = "YES";
                found = true;
            }
            return;
        }

        dfs(l + 1, sum + arr[l], arr);
        dfs(l + 1, sum, arr);
    }
}
