import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        String str = sc.nextLine();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        for (char c : set) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}
