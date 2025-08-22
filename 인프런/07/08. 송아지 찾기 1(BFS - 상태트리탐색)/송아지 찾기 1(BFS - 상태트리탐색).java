import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int max = 10000;

        int[] moves = {-1, 1, 5};
        int[] dist = new int[max + 1];
        Arrays.fill(dist, -1);
        dist[s] = 0;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(s);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int m : moves) {
                int nx = cur + m;

                if (nx < 1 || nx > max) continue;
                if (dist[nx] != -1) continue;

                dist[nx] = dist[cur] + 1;
                if (nx == e) {
                    System.out.println(dist[nx]);
                    return;
                }

                queue.offer(nx);
            }
        }
    }
}