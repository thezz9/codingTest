import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lines = new String[5];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            lines[i] = br.readLine();
            maxLen = Math.max(maxLen, lines[i].length());
        }

        StringBuilder sb = new StringBuilder(maxLen * 5);
        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                String s = lines[j];
                if (s.length() > i) {
                    sb.append(s.charAt(i));
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}