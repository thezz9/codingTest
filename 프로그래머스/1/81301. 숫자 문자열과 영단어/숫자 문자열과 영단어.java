import java.util.*;

class Solution {
    public int solution(String s) {

        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        Map<String, Integer> mapping = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            mapping.put(str[i], i);
        }

        StringBuilder sb = new StringBuilder();

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                word.append(ch);
            }

            if (mapping.containsKey(word.toString())) {
                sb.append(mapping.get(word.toString()));
                word.setLength(0);
            }
        }

        return Integer.parseInt(sb.toString());
    }
}