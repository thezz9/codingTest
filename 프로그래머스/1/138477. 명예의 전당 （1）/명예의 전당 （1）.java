import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> li = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            li.add(score[i]);
            
            if (li.size() > k) {
                Collections.sort(li);
                li.remove(0);
            }
      
            Collections.sort(li);
            answer[i] = li.get(0);
        }

        return answer;
    }
}