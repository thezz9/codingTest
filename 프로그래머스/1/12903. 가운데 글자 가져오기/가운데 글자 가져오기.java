class Solution {
    public String solution(String s) {
        int index = s.length() / 2;
        return (s.length() % 2 != 0)
                ? String.valueOf(s.charAt(index))
                : s.substring(index - 1, index + 1);
    }
}