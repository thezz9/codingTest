import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int five = n / 5;

        while (five >= 0) {
            int left = n - 5 * five;
            if (left % 3 == 0) {
                bw.write(String.valueOf(five + left / 3));
                bw.flush();
                return;
            }
            five--;
        }

        bw.write("-1");
        bw.flush();
    }
}