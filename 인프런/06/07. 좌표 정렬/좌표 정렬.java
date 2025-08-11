import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] xy = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                xy[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(xy, Comparator.comparingInt((int[] arr) -> arr[0])
            .thenComparingInt(arr -> arr[1]));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(xy[i][0]).append(" ").append(xy[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}