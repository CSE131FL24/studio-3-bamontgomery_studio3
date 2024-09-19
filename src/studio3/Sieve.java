package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int Sieve = in.nextInt();
	
		System.out.print("Enter the a number up to 120: ");
		int n = in.nextInt();
		
		boolean TruthValues[];
		
		TruthValues = new boolean [n];
		
		for (int j = 3; j < n; j++) {
			
			if (j % 2 == 0) {
				
				TruthValues[j] = false; // not composite
				
				
			}
			
			else {
				TruthValues[j] = true; // composite
			}
			
		}
		
		
		
	}

}
