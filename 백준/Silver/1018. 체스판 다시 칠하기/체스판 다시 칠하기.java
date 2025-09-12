import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int r = 0; r <= n - 8; r++) {
            for (int c = 0; c <= m - 8; c++) {
                int cnt = 0;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char actual = board[r + i][c + j];
                        char expected = ((i + j) % 2 == 0) ? 'W' : 'B';
                        if (actual != expected) cnt++;
                    }
                }

                int min = Math.min(cnt, 64 - cnt);
                if (ans > min) {
                    ans = min;
                }
            }
        }

        bw.write(Integer.toString(ans));
        bw.flush();
    }
}