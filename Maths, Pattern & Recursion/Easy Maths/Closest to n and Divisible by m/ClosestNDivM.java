class ClosestNDivM {
	
	private static int findClosestToNDivisibleByM(int n, int m) {
		
		int quotient = n / m;
		
		int n1 = m * quotient; // One possibility
		
		int n2 = (n * m) > 0 ? (m * (quotient + 1)) : (m * (quotient - 1)); // Another possibility
		
		return (Math.abs(n - n1) < Math.abs(n - n2)) ? n1 : n2;
	}
	
	public static void main(String[] args) {
		
		int n = -15;
		int m = -6;
		
		System.out.println(findClosestToNDivisibleByM(n, m));
		
	}
	
}