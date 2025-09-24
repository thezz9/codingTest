import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ja = 1;
        int mo = 1;
        for (int i = 1; i <= k; i++) {
            ja *= (n - i + 1);
            mo *= i;
        }

        bw.write(String.valueOf(ja / mo));
        bw.flush();
    }
}