import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<int[]> queue = new ArrayDeque<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            queue.offer(new int[] {k, i});
            priorityQueue.offer(k);
        }

        int result = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == priorityQueue.peek()) {
                priorityQueue.poll();
                result++;
                if (current[1] == m) {
                    System.out.println(result);
                    break;
                }
            } else {
                queue.offer(current);
            }
        }
    }
}