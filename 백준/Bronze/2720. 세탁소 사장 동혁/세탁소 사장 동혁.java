import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] units = {25, 10, 5, 1};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int c = Integer.parseInt(br.readLine());

            for (int unit : units) {
                int cnt = c / unit;
                c %= unit;
                sb.append(cnt).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}