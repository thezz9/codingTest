import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        long total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += (long)a * b;
        }

        System.out.println(total == sum ? "Yes" : "No");
    }
}