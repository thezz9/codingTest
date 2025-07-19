import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = sc.nextLine().toCharArray();

        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                printResult(count, chars[i - 1]);
                count = 1;
            }
        }

        printResult(count, chars[chars.length - 1]);
    }

    private static void printResult(int count, char c) {
        if (count != 1) {
            System.out.print(c + String.valueOf(count));
        } else {
            System.out.print(c);
        }
    }
}