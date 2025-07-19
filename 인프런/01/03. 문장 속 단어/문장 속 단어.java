import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArray = sc.nextLine().split(" ");
        String result = "";

        for (String s : strArray) {
            if (result.length() < s.length()) result = s;
        }

        System.out.println(result);
    }
}
