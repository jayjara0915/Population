import java.util.Scanner;

/* 
   @author Jaymar Jaramillo
   @date 8/1/2022
*/

//Programming Challenge 9 from Chapter 4
//of Starting out with >>> Java, Tony Gaddis

public class Population {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double test = 0;
		
		System.out.println("What is the number of starting organisms?:");
		var organisms = in.nextDouble();
		
		if (organisms < 2) {
			System.out.println("The starting size of the population must be 2 " +
							   "or greater.");
			System.out.println("Enter in the number of starting organisms:");
			organisms = in.nextDouble();
		}
		
		System.out.println("What is the average daily population (as a percentage) " +
						   "increase?:");
		var increase = in.nextDouble();
		
		if (increase < 0) {
			System.out.println("The average daily increase cannot be a negative number.");
			
			System.out.println("Enter in the daily increase that is 0 or greater:");
			increase = in.nextDouble();
			
		}
		
		System.out.println("What is the number of days they will multiply?:");
		var multiply = in.nextDouble();
		
		if (multiply < 1) {
			System.out.println("The number of days they will multiply cannot be less than 1.");
			
			System.out.println("Enter in the number of days they will multiply:");
			multiply = in.nextDouble();
		}
		
		increase = increase / 100;
		
		System.out.println("Day\t  Population Size");
		System.out.println("===========================");
		
		for (var i = 1; i <= multiply; i++) {
			System.out.printf(i + "\t\t" + "%,.0f\n", organisms);
			organisms += organisms * increase;
		}
	}
}