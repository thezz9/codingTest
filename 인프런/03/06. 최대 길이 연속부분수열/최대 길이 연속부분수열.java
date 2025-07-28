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

        int lt = 0, count = 0, result = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) count++;

            while (count > k) {
                if (arr[lt] == 0) count--;
                lt++;
            }
            result = Math.max(result, rt - lt + 1);
        }

        System.out.println(result);
    }
}