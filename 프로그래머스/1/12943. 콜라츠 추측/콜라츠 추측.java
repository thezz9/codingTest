class Solution {
    public int solution(long num) {
        int count = 0;

        if (num == 1) return 0;

        while (num > 1) {
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
            count++;
        }

        return (count > 500) ? -1 : count;
    }
}