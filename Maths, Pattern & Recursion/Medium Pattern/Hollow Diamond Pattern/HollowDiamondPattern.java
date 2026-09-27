class HollowDiamondPattern {
	
	/*
	namma_stars = 1 3 5 7 9
	
	anga_stars = 1 5 9 13
	
	row -> 0
	row = 0, c = 4 anga: 9
	row = 1, c = 3 anga: 7
	row = 2, c = 2 anga: 5
	row = 3, c = 1 anga: 3
	row = 4, c = 0 anga: 1
	
	row -> 1
	row = 1, c = 4, s = 1
	row = 2, c = 3, s = 3
	row = 3, c = 2, s = 5
	row = 4, c = 1, s = 7
	row = 5, c = 0, s = 9
	row = 6, c = 1, s = 7 => 10 - 6 = 4 (+3) => 7
	row = 7, c = 2, s = 5 => 10 - 7 = 3 (+2) => 5
	row = 8, c = 3, s = 3 => 10 - 8 = 2 (+1) => 3
	row = 9, c = 4, s = 1 => 10 - 9 = 1 (+0) => 1
	
	Formula: 2(2n - row) - 1
	
	*/
	
	private static void printHollowDiamondPattern(int n) {
		
		for(int row = 1; row <= (2 * n) - 1; row ++) {
			
			int spacesCount, starsCount;
			
			if(row <= n) {
				
				spacesCount = n - row;
				starsCount = (2 * row) - 1;
			}
			else {
				
				spacesCount = row - n;
				// starsCount = 2 * (row - n) - 1;
				starsCount = 2 * ((2 * n) - row) - 1;
			}
			
			for(int spaces = 1; spaces <= spacesCount; spaces ++) {
				
				System.out.print(" ");
			}
			
			// System.out.println("Stars count: " + starsCount);
			
			for(int stars = 1; stars <= starsCount; stars ++) {
				
				if(stars == 1 || stars == starsCount) {
					
					System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int n = 5;
		printHollowDiamondPattern(n);
		
	}
	
}