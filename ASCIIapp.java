package week2;

import java.util.Scanner;
public class ASCIIapp {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Declare the variable for the random number:
		int randomNumber;
		
		
		// Generate a random number from 0 to 255:
		randomNumber = ((int) (Math.random()*255 + 0));
		
		
		// Print the random number in its forms:
		// Original form.
		System.out.println("The random number chosen is: " + randomNumber);
		
		// Binary form.
		String binaryNumber = Integer.toBinaryString(randomNumber);
		System.out.println("The number in binary form is: " + binaryNumber);
		
		// Hexadecimal form.
		String hexNumber = Integer.toHexString(randomNumber);
		System.out.println("The number in hexadecimal form is: " + hexNumber);
		
		// ASCII character form.
		char randomCharacter = (char)randomNumber;
		System.out.format("The ASCII character that corresponds with this number is: "
							+ "\"%c\"", randomCharacter);

	}

}
