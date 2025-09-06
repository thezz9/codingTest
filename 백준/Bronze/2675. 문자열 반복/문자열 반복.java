import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            StringBuilder line = new StringBuilder(s.length() * m);
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                for (int l = 0; l < m; l++) {
                    line.append(c);
                }
            }
            sb.append(line).append("\n");
        }

        System.out.println(sb);
    }
}