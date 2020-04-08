//Write two overloaded methods that return the average of an array with the following headers:
//public static int average(int[] array) public static double average(double[] array)
//Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.

package practise;

import java.util.Scanner;

public class AverageArray {
	public static void main(String[] args) {

//		read in ten double values
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 double values:");

//		add values to new array
		double[] values = new double[10];
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextDouble();
		}

//		display average
		double averageOfValues = average(values);
		System.out.println("The average is: " + averageOfValues);

		input.close();
	}

//	method takes array of ints and returns average
	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		int average = sum / array.length;
		return average;
	}

//	method takes array of doubles and returns average
	public static double average(double[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		int average = sum / array.length;
		return average;
	}
}