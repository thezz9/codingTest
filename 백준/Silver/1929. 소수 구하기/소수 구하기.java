import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] comp = new boolean[n + 1];
        comp[0] = true;
        comp[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!comp[i]) {
                for (int j = i * i; j <= n; j += i) {
                    comp[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = Math.max(2, m); i <= n; i++) {
            if (!comp[i]) sb.append(i).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}