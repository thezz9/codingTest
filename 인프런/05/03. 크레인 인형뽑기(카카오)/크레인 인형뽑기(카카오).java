import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < m; i++) {
            int move = moves[i] - 1;
            for (int j = 0; j < n; j++) {
                int doll = board[j][move];
                if (doll != 0) {
                    if (!stack.empty() && stack.peek() == doll) {
                        result += 2;
                        stack.pop();
                    } else {
                        stack.push(doll);
                    }
                    board[j][move] = 0;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}