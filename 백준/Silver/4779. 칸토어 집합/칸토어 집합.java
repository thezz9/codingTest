import java.io.*;
import java.util.*;

public class Main {

    static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int length = (int) Math.pow(3, n);
            arr = new char[length];

            Arrays.fill(arr, '-');

            cantor(0, length);

            sb.append(arr).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }

    static void cantor(int start, int size) {
        if (size == 1) return;

        int third = size / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }

        cantor(start, third);
        cantor(start + 2 * third, third);
    }
}