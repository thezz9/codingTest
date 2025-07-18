import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = sc.nextLine().toLowerCase().toCharArray();
        int lt = 0, rt = chars.length - 1;
        String result = "YES";

        while (lt < rt) {
            if (chars[lt] != chars[rt]) {
                result = "NO";
                break;
            }
            lt++;
            rt--;
        }

        System.out.println(result);
    }
}
