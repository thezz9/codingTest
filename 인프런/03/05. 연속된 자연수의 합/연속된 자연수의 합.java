import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int lt = 1, rt = 1, sum = 1, result = 0;
        while (lt <= n / 2 + 1) {
            if (sum < n) {
                rt++;
                sum += rt;
            } else if (sum > n) {
                sum -= lt++;
            } else {
                result++;
                sum -= lt++;
            }
        }

        System.out.println(result);
    }
}