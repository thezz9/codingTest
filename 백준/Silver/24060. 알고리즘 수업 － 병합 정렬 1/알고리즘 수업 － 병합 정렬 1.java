import java.io.*;
import java.util.*;

public class Main {

    static int[] a, tmp;
    static int k, count = 0, result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        a = new int[n];
        tmp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, n - 1);

        bw.write(String.valueOf(result));
        bw.flush();
    }

    static void mergeSort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(p, q);
            mergeSort(q + 1, r);
            merge(p, q, r);
        }
    }

    static void merge(int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[t++] = a[i++];
            } else {
                tmp[t++] = a[j++];
            }
        }

        while (i <= q) tmp[t++] = a[i++];
        while (j <= r) tmp[t++] = a[j++];

        i = p;
        t = 0;

        while (i <= r) {
            a[i] = tmp[t];
            count++;
            if (count == k) {
                result = a[i];
            }
            i++;
            t++;
        }
    }
}