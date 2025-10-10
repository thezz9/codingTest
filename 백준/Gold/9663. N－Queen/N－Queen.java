import java.io.*;

public class Main {
    static int n;
    static int[] board;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        board = new int[n];
        backtrack(0);

        bw.write(String.valueOf(cnt));
        bw.flush();
    }

    static void backtrack(int row) {
        if (row == n) {
            cnt++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                backtrack(row + 1);
            }
        }
    }

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(row - i) == Math.abs(col - board[i]))
                return false;
        }
        return true;
    }
}