import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Integer> map = new HashMap<>();
        String s1 = br.readLine();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String s2 = br.readLine();
        for (char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String result = "YES";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result = "NO";
                break;
            }
        }

        System.out.println(result);
    }
}