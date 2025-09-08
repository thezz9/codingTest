import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toUpperCase();
        int[] cnt = new int[26];

        int max = 0, result = 0;
        boolean tie = false;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';
            int cur = ++cnt[idx];
            if (cur > max) {
                max = cur;
                result = idx;
                tie = false;
            } else if (cur == max) {
                tie = true;
            }
        }

        bw.write(tie ? '?' : (char)(result + 'A'));
        bw.flush();
    }
}