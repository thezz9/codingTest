import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long c = Integer.parseInt(st.nextToken());
        long d = Integer.parseInt(st.nextToken());

        long x = b, y = d;
        while (y != 0) {
            long r = x % y;
            x = y;
            y = r;
        }
        long g = x;

        long den = (b / g) * d;
        long num = (b / g) * c + (d / g) * a;

        long xx = num, yy = den;
        while (yy != 0) {
            long r = xx % yy;
            xx = yy;
            yy = r;
        }
        long gg = xx;

        num /= gg;
        den /= gg;

        bw.write(num + " " + den);
        bw.flush();
    }
}