class SumConsecutive {
	
	private static boolean checkExpressInSumConsecutive(int n) {
		
		// Base condition
		if(n == 1) {
			return false;
		}
		
		if((n & (n - 1)) == 0) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int n = 15;
		
		System.out.println(checkExpressInSumConsecutive(n));
	}
	
}