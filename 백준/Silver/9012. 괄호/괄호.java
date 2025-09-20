import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.clear();
            String s = br.readLine();
            boolean ok = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        ok = false;
                        break;
                    }
                    stack.pop();
                }
            }

            sb.append(ok && stack.isEmpty() ? "YES" : "NO").append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}