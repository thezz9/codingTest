import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0, min = Integer.MAX_VALUE;
        for (int num = m; num <= n; num++) {
            
            if (num < 2) continue;
            if (num == 2) {
                sum += 2;
                min = 2;
                continue;
            }
            if (num % 2 == 0) continue;

            boolean isPrime = true;
            int root = (int)Math.sqrt(num);
            for (int i = 3; i <= root; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += num;
                min = Math.min(min, num);
            }
        }

        if (sum == 0) {
            bw.write(Integer.toString(-1));
        } else {
            bw.write(String.format("%d\n%d", sum, min));
        }

        bw.flush();
    }
}