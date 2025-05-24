class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += (Math.sqrt(i) == (int)Math.sqrt(i)) ? -i : +i;
        }
        return result;
    }
}