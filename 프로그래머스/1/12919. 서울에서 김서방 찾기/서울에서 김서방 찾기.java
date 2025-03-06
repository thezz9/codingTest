class Solution {
    public String solution(String[] seoul) {
        int i = 0;
        String answer = "";
        for (String s : seoul) {
            if (s.equals("Kim")) {
                answer = "김서방은 " + i +"에 있다";
            }
            i++;
        }
        return answer;
    }
}