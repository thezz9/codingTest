import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] sorted = new int[n];
        int[] original = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(st.nextToken());
            sorted[i] = height;
            original[i] = height;
        }

        Arrays.sort(sorted);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (sorted[i] != original[i]) {
                if (sb.length() > 0) sb.append(" ");
                sb.append(i + 1);
            }
        }

        System.out.println(sb);
    }
}