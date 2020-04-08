// Write a program that generates 100 random integers between 0 and 9 and displays the count for each number.

package practise;

public class CountSingleDigits {
	public static void main(String[] args) {

//		create an array of 10 integers to count the single digits
		int[] counts = new int[10];
//		generate the 100 random numbers and increment the counts
		for (int i = 0; i < 100; i++) {
			int randomNum = (int) (Math.random() * 10);
			counts[randomNum]++;
		}

//		display the counts
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + " occurs " + counts[i] + (counts[i] > 1 ? " times." : " time."));
		}
	}

}
