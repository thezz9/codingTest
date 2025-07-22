import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int a = 1, b = 1;
        sb.append(a).append(" ").append(b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            sb.append(" ").append(c);
            a = b;
            b = c;
        }

        System.out.println(sb);
        sc.close();
    }
}