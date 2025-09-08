import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int i = 0, n = s.length(), result = 0;
        while (i < n) {
            char c0 = s.charAt(i);
            char c1 = (i + 1 < n) ? s.charAt(i + 1) : '\0';
            char c2 = (i + 2 < n) ? s.charAt(i + 2) : '\0';

            if (c0 == 'd' && c1 == 'z' && c2 == '=') {
                i += 3;
            } else if ((c0 == 'c' && (c1 == '=' || c1 == '-')) ||
                (c0 == 'd' && c1 == '-') ||
                (c0 == 'l' && c1 == 'j') ||
                (c0 == 'n' && c1 == 'j') ||
                (c0 == 's' && c1 == '=') ||
                (c0 == 'z' && c1 == '='))
            {
                i += 2;
            } else {
                i++;
            }
            result++;
        }

        bw.write(Integer.toString(result));
        bw.flush();
    }
}