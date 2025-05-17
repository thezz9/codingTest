class Solution {
    public boolean solution(int n) {
        String str = String.valueOf(n);
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += str.charAt(i) - '0';
        }
        return n % j == 0;
    }
}