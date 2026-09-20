public class SumNNatural {
	
	private static int findNNaturalNumbers(int n) {
		
		return (n * (n + 1)) / 2;
	}
	
	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println(findNNaturalNumbers(n));
	}
	
}