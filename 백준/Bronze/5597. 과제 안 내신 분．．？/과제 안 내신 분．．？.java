import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];

        String line;
        while ((line = br.readLine()) != null) {
            int i = Integer.parseInt(line);
            arr[i - 1] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sb.append(i + 1).append("\n");
            }
        }

        System.out.println(sb);
    }
}