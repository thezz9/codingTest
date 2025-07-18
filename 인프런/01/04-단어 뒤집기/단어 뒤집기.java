import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int i = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < i; j++) {
            sb.append(sc.nextLine());
            System.out.println(sb.reverse());
            sb.setLength(0);
        }
    }
}
