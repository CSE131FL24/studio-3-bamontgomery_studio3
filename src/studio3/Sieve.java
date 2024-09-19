package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);


		System.out.print("Enter the a number up to 120: ");
		int n = in.nextInt();
		boolean TruthValues[];

		TruthValues = new boolean [n+1]; 	// (n+1) because we are using the indexes are the values so we'd
		Arrays.fill(TruthValues, true);		//need to include the value  n itself by adding 1.	
		
		for (int i = 2; i < (int)Math.sqrt(n); i++) {
			if (TruthValues[i] == true) {
				for(int j = i*i; j<n+1; j = j+i) {
					TruthValues[j] = false;
				}
			}

			else {
				TruthValues[i] = true; // composite
			}

		}

		for (int z = 0; z < n+1; z++) {
			if (TruthValues[z] == true) {

				System.out.println("The value " +z +" is prime");
			}
		}

	}

}
