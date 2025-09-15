import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));
        bw.write(sb.reverse().toString());
        bw.flush();
    }
}