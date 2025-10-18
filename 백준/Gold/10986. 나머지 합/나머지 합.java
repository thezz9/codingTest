import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        long[] cnt = new long[m];
        long result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = (arr[i - 1] + Integer.parseInt(st.nextToken())) % m;
            cnt[arr[i]]++;
        }

        result += cnt[0];

        for (int i = 0; i < m; i++) {
            if (cnt[i] > 1) {
                result += cnt[i] * (cnt[i] - 1) / 2;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}