import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num = 666;
        while (true) {
            if (String.valueOf(num).contains("666")) {
                n--;
            }

            if (n == 0) {
                bw.write(String.valueOf(num));
                bw.flush();
                return;
            }

            num++;
        }
    }
}