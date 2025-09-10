import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int d = 1;
        while (n > d) {
            n -= d;
            d++;
        }

        int ja, mo;
        if (d % 2 == 1) {
            ja = d - n + 1;
            mo = n;
        } else {
            ja = n;
            mo = d - n + 1;
        }

        bw.write(ja + "/" + mo);
        bw.flush();
    }
}