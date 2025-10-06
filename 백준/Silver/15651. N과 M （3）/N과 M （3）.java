import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        backtrack(0);

        bw.write(sb.toString());
        bw.flush();
    }

    static void backtrack(int depth) {
        if (depth == m) {
            for (int x : arr) sb.append(x).append(' ');
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            backtrack(depth + 1);
        }
    }
}