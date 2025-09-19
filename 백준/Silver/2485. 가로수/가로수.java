import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] pos = new long[n];
        long[] diff = new long[n - 1];
        
        for (int i = 0; i < n; i++) {
            pos[i] = Long.parseLong(br.readLine());
        }
        
        for (int i = 0; i < n - 1; i++) {
            diff[i] = pos[i + 1] - pos[i];
        }

        long gcd = diff[0];
        for (int i = 1; i < diff.length; i++) {
            long a = gcd;
            long b = diff[i];

            while (b != 0) {
                long r = a % b;
                a = b;
                b = r;
            }
            gcd = a;
        }

        long ans = 0;
        for (long d : diff) {
            ans += (d / gcd) - 1;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
    }
}