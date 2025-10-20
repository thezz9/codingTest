import java.io.*;
import java.util.*;

public class Main {

    static int[][] board = new int[9][9];
    static List<int[]> blanks = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 0) {
                    blanks.add(new int[]{i, j});
                }
            }
        }

        backtrack(0);
    }

    public static void backtrack(int depth) {
        if (depth == blanks.size()) {
            print();
            System.out.print(sb);
            System.exit(0);
        }

        int[] now = blanks.get(depth);
        int r = now[0];
        int c = now[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(r, c, num)) {
                board[r][c] = num;
                backtrack(depth + 1);
                board[r][c] = 0;
            }
        }
    }

    static boolean isValid(int r, int c, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == num) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][c] == num) return false;
        }

        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }

    static void print() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(board[i][j]).append(' ');
            }
            sb.append('\n');
        }
    }
}