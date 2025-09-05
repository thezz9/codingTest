import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(st.nextToken());
            sum += score;
            max = Math.max(max, score);
        }

        System.out.println(sum * 100.0 / max / n);
    }
}