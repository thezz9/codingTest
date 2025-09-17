import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < b; i++) {
            if (set.contains(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }

        bw.write(String.valueOf(a + b - 2 * cnt));
        bw.flush();
    }
}