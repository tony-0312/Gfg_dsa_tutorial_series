// Solved using Bitwise AND(&) Operator
public class EvenOrOdd {
    
	private static boolean isEvenOrOdd(int n) {
		
		return ((n & 1) == 0) ? true : false;
	}
	
    public static void main(String[] args) {

		int n = 14;
		
		System.out.println(isEvenOrOdd(n));
    }
    
}
