//Write a program that prompts the user to enter the number of students, the students’ 
//names, and their scores, and prints student names in decreasing order of their scores.

package practise;

import java.util.Scanner;

public class SortStudents {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask user for number of students
		System.out.println("Enter the number of students");
		int num = input.nextInt();
		// create arrays of names and scores
		String[] names = new String[num];
		double[] scores = new double[num];

		// user to enter the names and scores
		for (int i = 0; i < num; i++) {
			System.out.println("Student " + (i + 1) + " name: ");
			names[i] = input.next();
			System.out.println("Student " + (i + 1) + " score: ");
			scores[i] = input.nextDouble();
		}
		// call the sortDescending method
		sortDescending(names, scores);

		// print out the names in order of decreasing scores
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}

		// close the scanner
		input.close();

	}

	// method to sort scores in decreasing order
	public static void sortDescending(String[] names, double[] nums) {

		// set largest number
		for (int i = 0; i < nums.length; i++) {
			double largestNum = nums[i];
			int largestNumIndex = i;

			// loop through other numbers and compare to largest
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > largestNum) {
					largestNum = nums[j];
					largestNumIndex = j;
				}
			}
			// swap the numbers if necessary
			String temp;
			if (largestNumIndex != i) {
				nums[largestNumIndex] = nums[i];
				nums[i] = largestNum;

				// swap the names
				temp = names[largestNumIndex];
				names[largestNumIndex] = names[i];
				names[i] = temp;

			}

		}

	}

}
