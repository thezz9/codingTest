import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();
        int[] cmd = new int[n];

        for (int i = 0; i < n; i++) {
            q.add(i + 1);
            cmd[i] = Integer.parseInt(st.nextToken());
        }

        while (q.size() > 1) {
            int cur = q.pollFirst();
            sb.append(cur).append(' ');
            int v = cmd[cur - 1];

            if (v > 0) {
                int limit = (v - 1) % q.size();
                for (int i = 0; i < limit; i++) {
                    q.addLast(q.pollFirst());
                }
            } else {
                int limit = (-v) % q.size();
                for (int i = 0; i < limit; i++) {
                    q.addFirst(q.pollLast());
                }
            }
        }
        sb.append(q.pollFirst());

        bw.write(sb.toString());
        bw.flush();
    }
}