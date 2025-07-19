import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) sb.append(c);
        }

        System.out.println(Integer.parseInt(sb.toString()));
    }
}
