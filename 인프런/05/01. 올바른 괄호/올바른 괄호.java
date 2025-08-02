import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        String str = br.readLine();
        String result = "YES";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    result = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            result = "NO";
        }

        System.out.println(result);
    }
}