//(Occurrence of max numbers) Write a program that reads integers, 
//finds the largest of them, and counts its occurrences. 
//that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; 
//the program finds that the largest is 5 and the occurrence count for 5 is 4.
package practise;

import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
	public static void main(String[] args) {
		
		//prompt user to enter the numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int num = input.nextInt();
		int max = num;
		int maxCount = 1;

		// loop through numbers until 0 entered
		while (num != 0) {
			num = input.nextInt();
			if (num > max) {
				max = num;
				maxCount = 1;
			} else if (num == max)
				maxCount++;
		}

		//display results
		System.out.println("The largest number is: " + max);
		System.out.println("The occurrence count of the largest number is: " + maxCount);

		// close the scanner
		input.close();

	}

}