import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0, index = 0;
        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                index = i;
            }
        }

        System.out.printf("%d\n%d", max, index);
    }
}