class Solution {
    public boolean solution(int x) {
        int sum = 0;
        boolean answer = true;
        String[] array = String.valueOf(x).split("");
        for (String result : array) {
            sum += Integer.parseInt(result);
        }
        if (x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}