import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int reverseNum = reverse(num);

            if (isPrime(reverseNum)) {
                sb.append(reverseNum).append(" ");
            }
        }

        System.out.println(sb);
        sc.close();
    }

    public static boolean isPrime(int reverseNum) {
        if (reverseNum == 1) return false;
        for (int i = 2; i < reverseNum; i++) {
            if (reverseNum % i == 0) return false;
        }
        return true;
    }

    public static int reverse(int num) {
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }
        return reverseNum;
    }
}