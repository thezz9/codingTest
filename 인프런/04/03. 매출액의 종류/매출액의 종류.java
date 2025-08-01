import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        sb.append(map.size()).append(" ");

        for (int i = k; i < n; i++) {
            int lt = arr[i - k];
            map.put(lt, map.get(lt) - 1);
            if (map.get(lt) == 0) {
                map.remove(lt);
            }

            int rt = arr[i];
            map.put(rt, map.getOrDefault(rt, 0) + 1);

            sb.append(map.size()).append(" ");
        }

        System.out.println(sb);
    }
}