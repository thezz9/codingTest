import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;

            if (sum - max <= max) {
                sb.append("Invalid");
            } else if (a == b && a == c) {
                sb.append("Equilateral");
            } else if (a == b || b == c || a == c) {
                sb.append("Isosceles");
            } else {
                sb.append("Scalene");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}