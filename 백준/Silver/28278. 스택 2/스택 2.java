import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char cmd = st.nextToken().charAt(0);

            switch (cmd) {
                case '1':
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case '2':
                    sb.append(stack.isEmpty() ? "-1" : stack.pop()).append('\n');
                    break;
                case '3':
                    sb.append(stack.size()).append('\n');
                    break;
                case '4':
                    sb.append(stack.isEmpty() ? '1' : '0').append('\n');
                    break;
                case '5':
                    sb.append(stack.isEmpty() ? "-1" : stack.peek()).append('\n');
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}