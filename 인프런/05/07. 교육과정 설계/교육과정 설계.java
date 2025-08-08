import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();
        String str = br.readLine();

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < t.length(); i++) {
            queue.offer(t.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (queue.isEmpty()) break;
            if (queue.peek() == str.charAt(i)) queue.poll();
        }

        System.out.println(queue.isEmpty() ? "YES" : "NO");
    }
}