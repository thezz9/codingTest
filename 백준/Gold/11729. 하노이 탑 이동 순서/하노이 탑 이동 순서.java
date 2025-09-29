import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        hanoi(n, 1, 2, 3);

        bw.write(count + "\n" + sb.toString());
        bw.flush();
    }

    static void hanoi(int n, int first, int second, int third) {

        if (n == 0) return;

        hanoi(n - 1, first, third, second);

        sb.append(first).append(' ').append(third).append('\n');
        count++;

        hanoi(n - 1, second, first, third);
    }
}