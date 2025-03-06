class Solution {
    public long solution(long num) {
        if (num == 1) {
            return 0;
        }
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;

            }
            count++;
            if (count >= 500) {
                return -1;
            }
        }
        return count;
    }
}