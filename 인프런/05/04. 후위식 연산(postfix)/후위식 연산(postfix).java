import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (c) {
                    case '+' : result = a + b; break;
                    case '-' : result = a - b; break;
                    case '*' : result = a * b; break;
                    case '/' : result = a / b; break;
                }

                stack.push(result);
            }
        }

        System.out.println(stack.pop());
    }
}