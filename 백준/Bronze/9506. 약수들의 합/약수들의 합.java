import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringBuilder sb = new StringBuilder();
            Queue<Integer> queue = new ArrayDeque<>();
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    queue.offer(i);
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    sb.append(queue.poll());
                    if (i < size - 1) {
                        sb.append(" + ");
                    } else {
                        sb.append("\n");
                    }
                }
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }

            bw.write(sb.toString());
        }

        bw.flush();
    }
}