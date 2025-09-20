import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        int order = 1;
        while (!queue.isEmpty()) {

            while (!stack.isEmpty() && stack.peek() == order) {
                stack.pop();
                order++;
            }

            int q = queue.poll();
            if (q == order) {
                order++;
            } else {
                stack.push(q);
            }
        }

        while (!stack.isEmpty() && stack.peek() == order) {
            stack.pop();
            order++;
        }

        bw.write(order == n + 1 ? "Nice" : "Sad");
        bw.flush();
    }
}