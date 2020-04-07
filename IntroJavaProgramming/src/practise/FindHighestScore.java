//Write a program that prompts the user to enter the number of students and each student’s name and score, 
//and finally displays the name of the student with the highest score.

package practise;

import java.util.Scanner;

public class FindHighestScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user for the number of students
		System.out.println("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		
		// initialize highest score and name 
		int highestScore = 0;
		String HighestScoreName = "";

		//read scores and compare to highest
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter name: ");
			String name = input.next();
			System.out.println("Enter score: ");
			int score = input.nextInt();

			// if greater than highest score, this is the new highest score
			if (score > highestScore) {
				highestScore = score;
				HighestScoreName = name;
			}

		}
		//display the results
		System.out.println("The student with the highest score is " + HighestScoreName);
		
		//close the scanner
		input.close();

	}
}