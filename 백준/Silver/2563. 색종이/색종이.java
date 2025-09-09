import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[][] grid = new boolean[100][100];

        int result = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int row = y; row < y + 10; row++) {
                for (int col = x; col < x + 10; col++) {
                    if (!grid[row][col]) {
                        grid[row][col] = true;
                        result++;
                    }
                }
            }
        }

        bw.write(Integer.toString(result));
        bw.flush();
    }
}