// * A program that converts a single hexadecimal digit into a decimal value.

package practise;

import java.util.Scanner;

public class HexDigitToDec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hexadecimal digit: ");
		char hex = input.next().charAt(0);

//		give decimal value an initial value
		int decimalValue = -1;

//		if it is a digit subtract the character '0'
		if (Character.isDigit(hex))
			decimalValue = (hex - '0');

//		if it is a valid hex letter convert to the appropriate digit
		else if (hex >= 'A' && hex <= 'F')
			decimalValue = (int) (hex - 'A' + 10);

//		print out the result
		System.out.println("The decimal value is: " + decimalValue);

		input.close();
	}

}
