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

            if (a == 0 && b == 0) break;

            String tmp;
            if (b % a == 0) {
                tmp = "factor\n";
            } else if (a % b == 0) {
                tmp = "multiple\n";
            } else {
                tmp = "neither\n";
            }

            sb.append(tmp);
        }

        bw.write(sb.toString());
        bw.flush();
    }
}