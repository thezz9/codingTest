import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int x = a, y = b;
            while (y != 0) {
                int r = x % y;
                x = y;
                y = r;
            }
            int gcd = x;

            bw.write(String.valueOf((a / gcd) * b));
            bw.newLine();
        }

        bw.flush();
    }
}