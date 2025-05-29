class Solution {
	public int[] solution(int n, int m) {
		int gcd = getGCD(n, m);
		int lcm = n * m / gcd;
		return new int[]{gcd, lcm};
	}
	
	private int getGCD(int n, int m) {
		while (m != 0) {
			int temp = m;
			m = n % m;
			n = temp;
		}
		return n;
	}
}