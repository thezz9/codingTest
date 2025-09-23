import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1":
                    queue.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    queue.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    sb.append(queue.isEmpty() ? "-1" : queue.pollFirst()).append('\n');
                    break;
                case "4":
                    sb.append(queue.isEmpty() ? "-1" : queue.pollLast()).append('\n');
                    break;
                case "5":
                    sb.append(queue.size()).append('\n');
                    break;
                case "6":
                    sb.append(queue.isEmpty() ? "1" : "0").append('\n');
                    break;
                case "7":
                    sb.append(queue.isEmpty() ? "-1" : queue.peekFirst()).append('\n');
                    break;
                case "8":
                    sb.append(queue.isEmpty() ? "-1" : queue.peekLast()).append('\n');
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}