import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int y = numbers[i] + numbers[j];
                if (!li.contains(y)) li.add(numbers[i] + numbers[j]);
            }
        }
        li.sort(Integer::compareTo);
        return li.stream().mapToInt(i -> i).toArray();
    }
}