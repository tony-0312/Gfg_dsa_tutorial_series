class PrintHollowRectangle {
	
	private static void printHollowRectangle(int rowLength, int colLength) {
		
		for(int row = 0; row < rowLength; row ++) {
			
			for(int col = 0; col < colLength; col ++) {
				
				if(row == 0 || row == rowLength - 1 || col == 0 || col == colLength - 1) {

					System.out.print("* ");
				}
				else {
					
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		int n = 3;
		int m = 5;
		
		printHollowRectangle(n, m);
	}
	
}