import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxHeight = sc.nextInt();
        int count = 1;

        for (int i = 1; i < n; i++) {
            int height = sc.nextInt();

            if (height > maxHeight) {
                count++;
                maxHeight = height;
            }
        }

        System.out.println(count);
        sc.close();
    }
}