import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int n = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[26];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char prev = 0;
            boolean ok = true;

            for (int j = 0; j < s.length(); j++) {
                char cur = s.charAt(j);

                if (cur != prev) {
                    int idx = cur - 'a';
                    if (visited[idx]) {
                        ok = false;
                        break;
                    }
                    visited[idx] = true;
                    prev = cur;
                }
            }

            if (ok) {
                result++;
            }

            Arrays.fill(visited, false);
        }

        bw.write(Integer.toString(result));
        bw.flush();
    }
}