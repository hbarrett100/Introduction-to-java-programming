// Write a method that returns the index of the smallest element in an array of integers. 
//If the number of such elements is greater than 1, return the smallest index. Use the following header:
//public static int indexOfSmallestElement(double[] array)
//Write a test program that prompts the user to enter ten numbers, invokes this
//method to return the index of the smallest element, and displays the index.

package practise;

import java.util.Scanner;

public class IndexOfSmallest {
	public static void main(String[] args) {
//		read in ten double values
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 double values: ");

//		add values to array
		double[] values = new double[10];
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextDouble();
		}

//		display result
		System.out.println("The index of the minimum is: " + indexOfSmallestElement(values));

//		close scanner
		input.close();
	}

//	return the index of the smallest element
	public static int indexOfSmallestElement(double[] array) {
		int indexOfMin = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[indexOfMin])
				indexOfMin = i;
		}
		return indexOfMin;
	}
}