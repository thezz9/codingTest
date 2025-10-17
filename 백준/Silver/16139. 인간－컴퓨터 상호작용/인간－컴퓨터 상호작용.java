import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int len = s.length();
        int[][] arr = new int[26][len + 1];

        for (int i = 0; i < len; i++) {
            int idx = s.charAt(i) - 'a';
            for (int j = 0; j < 26; j++) {
                arr[j][i + 1] = arr[j][i] + (j == idx ? 1 : 0);
            }
        }

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int idx = c - 'a';
            int cnt = arr[idx][r + 1] - arr[idx][l];
            sb.append(cnt).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}