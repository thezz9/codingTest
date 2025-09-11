import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String result;
        if (a + b + c != 180) {
            result = "Error";
        } else if (a == 60 && b == 60 && c == 60) {
            result = "Equilateral";
        } else if (a == b || b == c || a == c) {
            result = "Isosceles";
        } else {
            result = "Scalene";
        }

        bw.write(result);
        bw.flush();
    }
}