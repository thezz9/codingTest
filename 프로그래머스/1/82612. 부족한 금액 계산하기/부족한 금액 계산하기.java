class Solution {
	public long solution(int price, int money, int count) {
		long totalPrice = price * (long)count * (count + 1) / 2;
		return Math.max(0, totalPrice - money);
	}
}
