public class ProgramCheck {
	
	private static boolean checkPrimeOrNot(int number) {
		
		if(number == 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(number); i ++) {
			
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int number = 25;
		
		System.out.println((checkPrimeOrNot(number)) ? "Prime number" : "Not an prime number");
	}
	
}