import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(s);
        int start = Math.max(1, n - 9 * s.length());

        for (int i = start; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (i + sum == n) {
                bw.write(String.valueOf(i));
                bw.flush();
                return;
            }
        }

        bw.write("0");
        bw.flush();
    }
}