import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine().toLowerCase();
        String result = "YES";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }

        String onlyLetters = sb.toString();
        int lt = 0, rt = onlyLetters.length() - 1;

        while (lt < rt) {
            if (onlyLetters.charAt(lt) != onlyLetters.charAt(rt)) {
                result = "NO";
                break;
            }

            lt++;
            rt--;
        }

        System.out.println(result);
    }
}
