import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] cache = new int[s];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            int hitIdx = - 1;

            for (int j = 0; j < s; j++) {
                if (cache[j] == x) {
                    hitIdx = j;
                    break;
                }
            }

            if (hitIdx == -1) {
                for (int j = s - 1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
            } else {
                for (int j = hitIdx; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
            }
            cache[0] = x;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s; i++) {
            if (i > 0) sb.append(" ");
            sb.append(cache[i]);
        }

        System.out.println(sb);
    }
}