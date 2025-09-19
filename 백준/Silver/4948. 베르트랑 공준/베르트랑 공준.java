import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int limit = 2 * 123456;
        boolean[] comp = new boolean[limit + 1];
        comp[0] = true;
        comp[1] = true;

        for (int i = 2; i * i <= limit; i++) {
            if (!comp[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    comp[j] = true;
                }
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!comp[i]) cnt++;
            }
            sb.append(cnt).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}