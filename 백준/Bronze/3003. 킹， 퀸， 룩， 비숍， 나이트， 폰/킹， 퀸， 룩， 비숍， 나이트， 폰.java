import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = {1, 1, 2, 2, 2, 8};

        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(x - Integer.parseInt(st.nextToken())).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}