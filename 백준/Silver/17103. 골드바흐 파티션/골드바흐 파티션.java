import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int limit = 1000000;
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

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int j = 2; j <= num / 2; j++) {
                if (!comp[j] && !comp[num - j]) cnt++;
            }
            sb.append(cnt).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}