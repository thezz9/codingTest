class Solution {
    public String solution(String phone_number) {
        int index = phone_number.length() - 4;
        String oldStr = phone_number.substring(index);
        String newStr = "*".repeat(index);
        return newStr + oldStr;
    }
}