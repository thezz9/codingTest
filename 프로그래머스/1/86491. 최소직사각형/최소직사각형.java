import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < sizes.length; i++) {
            int[] arr = sizes[i];
            if (max < Arrays.stream(arr).max().getAsInt()) {
                max = Arrays.stream(arr).max().getAsInt();
            }
            if (min < Arrays.stream(arr).min().getAsInt()) {
                min = Arrays.stream(arr).min().getAsInt();
            }
        }
        return max * min;
    }
}