import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                sb.append("D\n");
            } else if (
                a[i] == 1 && b[i] == 3 ||
                    a[i] == 2 && b[i] == 1 ||
                    a[i] == 3 && b[i] == 2
            ) {
                sb.append("A\n");
            } else {
                sb.append("B\n");
            }
        }

        System.out.println(sb);
        sc.close();
    }
}