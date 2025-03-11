class Solution {
    public int solution(int[] numbers) {
       int answer = 0;
       for (int i = 0 ; i <= 9 ; i++) {
           boolean exists = false;
           for (int j : numbers) {
               if (j == i) {
                   exists = true;
                   break;
               }
           }
           if (!exists) answer += i;
       }
       return answer;
    }
}