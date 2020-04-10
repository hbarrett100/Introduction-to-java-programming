//Write a method that returns a new array by eliminating the duplicate values in the array using the following method header:
//public static int[] eliminateDuplicates(int[] list)
//Write a test program that reads in ten integers, invokes the method, and displays
//the result. Here is the sample run of the program:

package practise;

import java.util.Scanner;

public class EliminateDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the user to enter 10 digits
		System.out.println("Enter 10 integers: ");

		// create array
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		// create array without duplicates by calling eliminateDuplicates method
		int[] numbersNoDuplicates = eliminateDuplicates(numbers);
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < numbersNoDuplicates.length; i++) {
			System.out.print(numbersNoDuplicates[i]);
		}
		// close the scanner
		input.close();
	}

	// method to return a new array with duplicates removed
	public static int[] eliminateDuplicates(int[] list) {
		int index = 0;
		// create temp array of max possible size 10
		int[] tempArray = new int[10];
		// if value is not already present in temp array, add it
		for (int i = 0; i < tempArray.length; i++) {
			if (alreadyPresent(tempArray, list[i], index) == false) {
				tempArray[index] = list[i];
				index++;
			}
		}

		// create new array using values from temp array
		int[] noDuplicates = new int[index];
		for (int i = 0; i < index; i++) {
			noDuplicates[i] = tempArray[i];
		}
		return noDuplicates;
	}

	// return true if value already present in array, false otherwise
	public static boolean alreadyPresent(int[] arr, int n, int idx) {
		for (int i = 0; i < idx; i++) {
			if (arr[i] == n)
				return true;
		}
		return false;
	}
}