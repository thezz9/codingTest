import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xMax = Math.max(xMax, x);
            yMax = Math.max(yMax, y);
            xMin = Math.min(xMin, x);
            yMin = Math.min(yMin, y);
        }

        bw.write(Long.toString((long)(xMax - xMin) * (yMax - yMin)));
        bw.flush();
    }
}