import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = sc.nextLine().split(" ");

        String str = strArray[0];
        char letter = strArray[1].charAt(0);

        int[] result = new int[str.length()];

        int letterIndex = -1000;
        for (int i = 0; i < str.length(); i++) {
            if (letter == str.charAt(i)) {
                result[i] = 0;
                letterIndex = i;
            }

            result[i] = i - letterIndex;
        }

        letterIndex = 1000;
        for (int j = str.length() - 1; j >= 0; j--) {
            if (letter == str.charAt(j)) {
                letterIndex = j;
            }

            result[j] = Math.min(result[j], letterIndex - j);
        }

        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}