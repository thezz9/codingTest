class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1 ; i < food.length; i++) {
            int foods = food[i] / 2;
            if (foods > 0) {
                sb.append(String.valueOf(i).repeat(foods));
            }
        }
        String str = String.valueOf(sb.reverse());
        sb.reverse();
        sb.append(0);
        sb.append(str);
        return sb.toString();
    }
}