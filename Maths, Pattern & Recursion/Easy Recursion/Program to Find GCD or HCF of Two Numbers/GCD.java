public class GCD {
	
	private static int findGCD(int a, int b) {
		
		if(a == b) {
			return a;
		}
		
		if(a == 0) {
			return b;
		}
		
		if(b == 0) {
			return a;
		}
		
		if((a & 1) == 0) {
			
			if((b & 1) == 0) {
				return findGCD(a >> 1, b >> 1) << 1;
			}
			else {
				return findGCD(a >> 1, b);
			}
		}
		
		if((b & 1) == 0) {
			
			return findGCD(a, b >> 1);
		}
		
		if(a > b) {
			return findGCD((a - b) >> 1, b);
		}
		
		return findGCD((b - a) >> 1, a);
		
	}
	
	public static void main(String[] args) {
		
		int a = 246;
		int b = 642;
		
		System.out.println(findGCD(a, b));
		
	}
	
}