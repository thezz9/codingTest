import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        char c = sc.nextLine().toLowerCase().charAt(0);

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) result++;
        }

        System.out.println(result);
    }
}
