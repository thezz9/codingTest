import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String t = br.readLine();

        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        int len = t.length();

        for (int i = 0; i < len; i++) {
            char c = t.charAt(i);
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < len - 1; i++) {
            char c = str.charAt(i);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
        }

        int result = 0;
        int lt = 0;
        for (int rt = len - 1; rt < str.length(); rt++) {
            char rightChar = str.charAt(rt);
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);

            if (windowMap.equals(targetMap)) {
                result++;
            }

            char leftChar = str.charAt(lt);
            windowMap.put(leftChar, windowMap.get(leftChar) - 1);
            if (windowMap.get(leftChar) == 0) {
                windowMap.remove(leftChar);
            }

            lt++;
        }

        System.out.println(result);
    }
}