//The arrays list1 and list2 are strictly identical if their corresponding elements are equal. 
//Write a method that returns true if list1 and list2 are strictly identical, using the following header:
//public static boolean equals(int[] list1, int[] list2)

//Write a test program that prompts the user to enter two lists of integers and dis- plays 
//whether the two are strictly identical. Here are the sample runs. 
//Note that the first number in the input indicates the number of the elements in the list. 
//This number is not part of the list.

package practise;

import java.util.Scanner;

public class StrictlyIdenticalArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the user for the first list
		System.out.println("Enter the first list:");

		// the first number entered is the size of the list
		int list1Size = input.nextInt();
		int[] list1 = new int[list1Size];

		// read in the contents of the list
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		// prompt the user for the second list
		System.out.println("Enter the Second list:");

		// the first number entered is the size of the list
		int list2Size = input.nextInt();
		int[] list2 = new int[list2Size];
		// read in the contents of the list
		for (int j = 0; j < list2.length; j++) {
			list2[j] = input.nextInt();
		}

		// display the results
		System.out.println(
				"The two lists are " + (equals(list1, list2) ? "strictly identical." : "not strictly identical."));
		// close the scanner
		input.close();
	}

	// returns true if two lists are identical, false otherwise
	public static boolean equals(int[] list1, int[] list2) {
		for (int i = 0; i < list1.length && i < list2.length; i++) {
			if (list1[i] != list2[i]) {
				return false;
			}
		}
		return true;

	}

}
