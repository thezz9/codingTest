class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ", -1);
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            for (int j = 0; j < sb.length(); j++) {
                if (j % 2 == 0) {
                    sb.setCharAt(j, Character.toUpperCase(sb.charAt(j)));
                } else {
                    sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
                }
            }
            arr[i] = sb.toString();
        }
        return String.join(" ", arr);
    }
}