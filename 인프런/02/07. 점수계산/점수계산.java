import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int score = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input == 1) {
                cnt++;
                score += cnt;
            } else {
                cnt = 0;
            }
        }

        System.out.println(score);
    }
}