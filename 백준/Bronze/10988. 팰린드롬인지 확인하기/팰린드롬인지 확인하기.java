import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int lt = 0, rt = s.length() - 1;
        boolean correct = true;

        while (lt < rt) {
            if (s.charAt(lt) != s.charAt(rt)) {
                correct = false;
                break;
            }
            lt++;
            rt--;
        }

        bw.write(correct ? "1" : "0");
        bw.flush();
    }
}