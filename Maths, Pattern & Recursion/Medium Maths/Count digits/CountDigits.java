public class CountDigits {
	
	private static int countDigits(double number) {
		
		if(number == 0) {
			return 1;
		}
		
		return (int) (Math.floor(Math.log10(number)) + 1);
		
	}
	
	public static void main(String[] args) {
		
		int number = 1257;
		
		System.out.println(countDigits(number));
		
	}
	
}