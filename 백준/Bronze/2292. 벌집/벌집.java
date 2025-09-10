import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int layer = 1;
        long max = 1;

        while (n > max) {
            max += 6L * layer;
            layer++;
        }

        bw.write(Integer.toString(layer));
        bw.flush();
    }
}