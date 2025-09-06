import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (arr[idx] == -1) {
                arr[idx] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(x).append(" ");
        }

        System.out.println(sb);
    }
}