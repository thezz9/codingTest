import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n <= 1) {
            bw.flush();
            return;
        }

        StringBuilder sb = new StringBuilder();

        while (n % 2 == 0) {
            sb.append(2).append("\n");
            n /= 2;
        }

        for (int i = 3; i <= n / i; i += 2) {
            while (n % i == 0) {
                sb.append(i).append("\n");
                n /= i;
            }
        }

        if (n > 1) sb.append(n).append("\n");

        bw.write(sb.toString());
        bw.flush();
    }
}