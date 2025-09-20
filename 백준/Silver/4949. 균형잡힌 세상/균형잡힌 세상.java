import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) break;

            stack.clear();
            boolean ok = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        ok = false;
                        break;
                    }
                    char top = stack.peek();
                    if ((top == '(' && c == ')') || (top == '[' && c == ']')) {
                        stack.pop();
                    } else {
                        ok = false;
                        break;
                    }
                }
            }

            sb.append(ok && stack.isEmpty() ? "yes" : "no").append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}