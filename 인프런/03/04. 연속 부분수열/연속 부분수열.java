import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0, rt = 0, sum = 0, result = 0;
        while (rt <= n) {
            if (sum < m) {
                if (rt == n) break;
                sum += arr[rt++];
            } else if (sum > m) {
                sum -= arr[lt++];
            } else {
                result++;
                sum -= arr[lt++];
            }
        }

        System.out.println(result);
    }
}