import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 'D') sum += 3;
            else if (c < 'G') sum += 4;
            else if (c < 'J') sum += 5;
            else if (c < 'M') sum += 6;
            else if (c < 'P') sum += 7;
            else if (c < 'T') sum += 8;
            else if (c < 'W') sum += 9;
            else sum += 10;
        }

        System.out.println(sum);
    }
}