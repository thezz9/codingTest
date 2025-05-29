class Solution {
	public int solution(String t, String p) {
		int result = 0;
		int len = p.length();
		long a = Long.parseLong(p);
		for (int i = 0; i <= t.length() - len; i++) {
			long b = Long.parseLong(t.substring(i, i + len));
			if (a >= b)
				result++;
		}
		return result;
	}
}