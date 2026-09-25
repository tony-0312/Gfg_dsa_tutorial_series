public class PowerFunction {
	/*
	if e is even -> power (b, e / 2) * power (b, e / 2)
	if e is odd -> b * power (b, e / 2) * power (b, e / 2)
	*/
	
	
	private static double powerFunction(double b, int e) {
		
		if(e == 0) {
			
			return 1;
		}
		
		// if e is -ve
		if(e < 0) {
			return 1 / powerFunction(b, -e);
		}
		
		double temp = powerFunction(b, e >> 1);
		
		if((e & 1) == 0) {
			
			return temp * temp;
		}
		else {
			
			return b * temp * temp;
		}
		
	}
	
	public static void main(String[] args) {
		
		double b = -0.67000;
		
		int e = -7;
		
		System.out.println(powerFunction(b, e));
		
	}
	
}