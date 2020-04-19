//Another solution for Listing 5.9 to find the greatest common divisor of two integers n1 and n2 is as follows: 
//First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, ..., 2, or 1 is a divisor for 
//both n1 and n2 in this order. The first such common divisor is the greatest common divisor for n1 and n2. 
//Write a program that prompts the user to enter two positive integers and displays the gcd.


package practise;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		//prompt the user to enter two integers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two positive integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		

		//find the minimum
		int d = (num1 < num2 ? num1 : num2);
		
		//check if d divides into both numbers
		while (d != 0) {
			if (num1 % d == 0 && num2 % d == 0)
				break;
			else
				d--;
		}
		
		//display the result
		System.out.println("The greatest common divisor is " + d);
		
		//close the scanner
		input.close();
	}
}
