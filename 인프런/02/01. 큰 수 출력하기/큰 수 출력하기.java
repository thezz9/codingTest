import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int n = sc.nextInt();

        int prev = sc.nextInt();
        result.append(prev);

        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();

            if (current > prev) {
                result.append(" ").append(current);
            }

            prev = current;
        }

        System.out.println(result);
    }
}