import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int i = 0;
        for (int result : arr) {
            if (result % divisor == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = result;
            }
        }
        if (answer.length == 0) {
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length - 1] = -1;
        }
        Arrays.sort(answer);
        return answer;
    }
}