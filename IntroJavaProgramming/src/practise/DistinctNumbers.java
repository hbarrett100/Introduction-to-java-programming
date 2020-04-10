//Write a program that reads in ten numbers and displays the number of distinct numbers
// and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once). 
// After the input, the array contains the distinct numbers. Here is the sample run of the program:

//Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
//The number of distinct number is 6
//The distinct numbers are: 1 2 3 6 4 5

package practise;

import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//	create boolean array
		boolean[] numberFlags = new boolean[10];
		int [] numbers = new int[10];
		System.out.println("Enter ten numbers");
		for (int i = 0; i < numbers.length; i ++) {
			numbers[i] = input.nextInt();
		}
	
//		change each number in the numbers array to true in boolean array
//		this will account for duplicates
		for (int i = 0; i < numbers.length; i ++) {
			numberFlags[numbers[i] -1] = true;
		}

//		count the number of distinct numbers entered 	
		int counter = 0;
		for (int i = 0; i < numberFlags.length; i ++) {
			if (numberFlags[i])
				counter ++;
		}
		
//		display number of unique values
		System.out.println("The number of  distinct numbers is : " + counter);
		
//		display the values
		System.out.print("The numbers are: ");
		for (int i = 0; i < numbers.length; i ++) {
			if (numberFlags[i])
				System.out.print(i + 1 + " ");
		}
		
//		close the scanner
		input.close();

	}
}