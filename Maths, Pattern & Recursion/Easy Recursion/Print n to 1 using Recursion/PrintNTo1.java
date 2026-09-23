public class PrintNTo1 {
	
	private static void print1ToN(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.print(n + " ");
		print1ToN(n - 1);
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		
		print1ToN(n);
	}
	
}