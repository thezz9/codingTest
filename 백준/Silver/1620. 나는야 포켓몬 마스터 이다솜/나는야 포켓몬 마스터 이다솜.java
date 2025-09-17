import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> nameToIdx = new HashMap<>();
        String[] idxToName = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            nameToIdx.put(s, i);
            idxToName[i] = s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            char c = s.charAt(0);
            if (c >= '0' && c <= '9') {
                sb.append(idxToName[Integer.parseInt(s)]);
            } else {
                sb.append(nameToIdx.get(s));
            }
            sb.append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}