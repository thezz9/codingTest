import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.put(sorted[i], i);
        }

        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(map.get(x)).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}