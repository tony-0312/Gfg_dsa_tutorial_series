class PrintFloydTriangle {
	
	private static void printFloydTriangle(int rowLength) {
		
		int counter = 1;
		
		for(int row = 0; row < rowLength; row ++) {
			
			for(int col = 0; col < row + 1; col ++) {
				
				System.out.print(counter ++ + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		int n = 6;
		
		printFloydTriangle(n);
	}
	
}