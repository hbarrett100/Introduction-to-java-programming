// Write a program that reads an unspecified number of scores and determines how many scores are above or equal
// to the average and how many scores are below the average. Enter a negative number to signify the end of the input. 
// Assume that the maximum number of scores is 100.

package practise;

import java.util.Scanner;

public class AnalyzeScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//	create empty array of scores
		int[] scores = new int[100];
		System.out.println("Enter scores:");

		
//		read the scores
		int score = input.nextInt();
		int i = 0;
		int counter = 0;
		
//		while score is not negative, add to array and increment i and counter
		while (score > 0) {
			scores[i] = score;
			i++;
			counter ++;
			score = input.nextInt();
		}

//		calculate the average of the scores entered
		int sum = 0;
		for(int j = 0; j < counter; j++) {
			sum += scores[j];
		}
		int average = sum/counter;
		
//		calculate how many are above and below the average
		int below = 0;
		int above = 0;

		for (int k = 0; k  < counter; k ++) {
			if (scores[k] >= average) {
				above++;
			}else
				below++;
		}
		
//		display the results
		System.out.println("The number of scores above or equal to average is " + above);
		System.out.println("The number of scores below average is " + below);
		
//		close the scanner
		input.close();
	}
}
