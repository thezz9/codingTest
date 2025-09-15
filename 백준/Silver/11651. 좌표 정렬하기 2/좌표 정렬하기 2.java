import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] xy = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                xy[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(xy, Comparator.comparingInt((int[] arr) -> arr[1])
            .thenComparing(arr -> arr[0]));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(xy[i][0]).append(" ").append(xy[i][1]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}