import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int result = 0;
        int place = 1;
        for (int i = 0; i < 3; i++) {
            int digit = b % 10;
            int part = a * digit;
            System.out.println(part);
            result += part * place;
            b /= 10;
            place *= 10;
        }
        System.out.println(result);
    }
}