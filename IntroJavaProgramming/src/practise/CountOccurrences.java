// Write a program that reads the integers between 1 and 100 and counts the occurrences of each. 
// Assume the input ends with 0. Here is a sample run of the program:

//Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
//2 occurs 2 times
//3 occurs 1 time
//4 occurs 1 time
//5 occurs 2 times
//6 occurs 1 time
//23 occurs 1 time
//43 occurs 1 time

package practise;

import java.util.Scanner;

public class CountOccurrences {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
//		create empty array of counts
		int[] counts = new int[100];
		System.out.println("Enter the integers between 1 and 100.");

//		read the number
		int number = input.nextInt();
		
//		while number is not equal to zero increment its count in the counts array
		while (number != 0) {
			counts[number]++;
			number = input.nextInt();
		}

//		if value in array is not zero, display result
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				System.out.println(i + " occurs " + counts[i] + (counts[i] < 2 ? " time." : " times."));
			}
		}
		// close the scanner
		input.close();
	}

}
