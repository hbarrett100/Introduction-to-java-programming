package practise;

import java.util.Scanner;

public class Hangman2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			// create random word
			String word = randomWord();

			// create array of *
			char[] wordArr = new char[word.length()];
			for (int i = 0; i < wordArr.length; i++)
				wordArr[i] = '*';
			//initialise counter
			int guessCount = 0;

			String lettersGuessed = "";
			//keep playing while there are still asterisk in the array
			while (starsInArray(wordArr)) {

				System.out.print("Guess a letter ");
				printArray(wordArr);
				char ch = input.next().charAt(0);

				if (isInWord(word, ch)) {
					replaceAsterisk(wordArr, ch, word);

				} else if (isInWord(word, ch) && alreadyGuessed(word, ch)) {
					System.out.println(ch + " is already in the word");
				} else if (isInWord(word, ch) == false && alreadyGuessed(word, ch)) {
					System.out.println(ch + " is not in the word");
				} else if (isInWord(word, ch) == false) {
					System.out.println(ch + " is not in the word");
					guessCount++;
				}

			}
			//display the results
			System.out.println("You win! The word is [" + word + "]. You missed " + guessCount + " times.");

			//ask user to play aagin
			System.out.println("Enter 'y' to play again or any other character to exit.");
			char ch = input.next().charAt(0);
			if (ch != 'y')
				break;
		}

		input.close();
	}

	// return true if letter has already been guessed
	public static boolean alreadyGuessed(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				return true;
		}
		return false;
	}

	// return true if there are still asterisk in the array
	public static boolean starsInArray(char[] arr) {
		for (char ch : arr) {
			if (ch == '*')
				return true;
		}
		return false;
	}

	//print the array
	public static void printArray(char[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.print("]");
	}

	// return a random word
	public static String randomWord() {
		String[] words = { "conor", "hannah", "jack" };
		int index = (int) (Math.random() * words.length);
		String word = words[index].toLowerCase();

		return word;
	}

	// return true if letter guessed is in word
	public static boolean isInWord(String word, char ch) {

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch)
				return true;
		}
		return false;
	}

	// replace asterisk with correctly guessed letter
	public static void replaceAsterisk(char[] arr, char ch, String word) {

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch) {
				arr[i] = ch;
			}

		}

	}
}
