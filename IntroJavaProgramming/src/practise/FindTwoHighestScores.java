//Write a program that prompts the user to enter the number of students and each
//student’s name and score, and finally displays the student with the highest score 
//and the student with the second-highest score.

package practise;

import java.util.Scanner;

public class FindTwoHighestScores {
	public static void main(String[] args) {

		// prompt user for number of students
		Scanner input = new Scanner(System.in);
		System.out.println("Enter tne number of students: ");
		int numberOfStudents = input.nextInt();

		// initalise variables
		int largestScore = 0;
		int secondLargestScore = 0;
		int tempScore = 0;
		String tempName = "";
		String largestScoreName = "";
		String secondLargestScoreName = "";

		// prompt user for names and scores
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter name: ");
			String name = input.next();
			System.out.println("Enter score: ");
			int score = input.nextInt();

			// assign largest and second largest scores
			if (score > largestScore && score > secondLargestScore) {
				tempScore = largestScore;
				tempName = largestScoreName;
				largestScore = score;
				largestScoreName = name;
				secondLargestScore = tempScore;
				secondLargestScoreName = tempName;

			} else if (score > secondLargestScore && score < largestScore) {
				secondLargestScore = score;
				secondLargestScoreName = name;
			}

		}
		// display the results
		System.out.println("The student with the highest score is " + largestScoreName
				+ "\nThe student with the second largest score is " + secondLargestScoreName);

		// close the scanner
		input.close();

	}
}