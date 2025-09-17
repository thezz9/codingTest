import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<String> hash = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hash.add(br.readLine());
        }

        Set<String> tree = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (hash.contains(s)) {
                tree.add(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(tree.size()).append('\n');
        for (String s : tree) {
            sb.append(s).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}