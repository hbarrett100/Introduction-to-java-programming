// Write a program that reads an unspecified number of integers, 
// determines how many positive and negative values have been read, 
// and computes the total and average of the input values (not counting zeros). 
// Your program ends with the input 0. Display the average as a floating-point number.

package practise;

import java.util.Scanner;

public class CountPosNeg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the users for numbers
		System.out.println("Enter numbers. Enter 0 to finish.");

		// initialise variables
		int n;
		int countPositive = 0;
		int countNegative = 0;
		int sum = 0;
		// while number is not zero check if it is positive or negative
		do {
			n = input.nextInt();
			sum += n;
			if (n < 0) {
				countNegative++;
			} else if (n > 0) {
				countPositive++;
			}
		} while (n != 0);

		// display results
		System.out.println("The number of positives is: " + countPositive);
		System.out.println("The number of negatives is: " + countNegative);
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + sum / (countPositive + countNegative));

		// close scanner
		input.close();

	}

}
