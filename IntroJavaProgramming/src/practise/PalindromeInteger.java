package practise;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		//prompt the user to enter a number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = input.nextInt();
		//display the result
		System.out.println("The number is " + (isPalindrome(num) ? "a palindrome" : "not a palindrome"));
		//close the scanner
		input.close();

	}

	//return reversed integer
	public static int reverse(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return reversed;

	}

	//return true if number equal to reversed number, else return false
	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}

}