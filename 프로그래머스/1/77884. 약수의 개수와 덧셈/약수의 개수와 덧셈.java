class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        while (left <= right) {
            int count = 0;
            for (int i = 1; i <= left; i++) {
                if (left % i == 0) {
                    count++;
                    System.out.println("left = " + left);
                    System.out.println("count = " + count);
                }
            }
            if (count % 2 == 0) {
                answer += left;
                System.out.println("answer++ = " + answer);
            } else {
                answer -= left;
                System.out.println("answer-- = " + answer);
            }
            left++;
        }
        return answer;
    }
}