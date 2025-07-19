import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        for (int i = 0; i < n; i++) {
            String binary = str.substring(i * 7, i * 7 + 7)
                .replace('#', '1')
                .replace('*', '0');

            System.out.print((char) Integer.parseInt(binary, 2));
        }
    }
}