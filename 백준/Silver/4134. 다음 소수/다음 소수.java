import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long num = Math.max(Long.parseLong(br.readLine()), 2);

            while (true) {
                boolean isPrime;

                if (num == 2) {
                    isPrime = true;
                } else if (num % 2 == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                    for (long j = 3; j * j <= num; j += 2) {
                        if (num % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    sb.append(num).append('\n');
                    break;
                }

                num++;
            }
        }

        bw.write(sb.toString());
        bw.flush();


    }
}