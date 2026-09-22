import java.util.Scanner;

class PrintRectangle {
	
	private static void printRectangle(int rowLength, int colLength) {
		
		for (int row = 0; row < rowLength; row ++) {
			
			for (int col = 0; col < colLength; col ++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		printRectangle(n, m);
		
	}
	
}