import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        long x = a, y = b;
        while (y != 0) {
            long r = x % y;
            x = y;
            y = r;
        }
        long gcd = x;

        bw.write(String.valueOf((a / gcd) * b));
        bw.flush();
    }
}