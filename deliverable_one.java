package deliverable_one;

import java.util.Scanner;

public class deliverable_one {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int hundreds1 = 0;
		int tens1 = 0;
		int ones1 = 0;
		int hundreds2 = 0;
		int tens2 = 0;
		int ones2 = 0;
		
		System.out.println("Enter a 3 digit number:"); //user inputs 3 digit number
		int number1 = scnr.nextInt();
		hundreds1 = number1 / 100;
		tens1 = (number1 - (hundreds1 * 100)) / 10;
		ones1 = (number1 - (hundreds1 * 100) - (tens1 * 10));
		
		System.out.println("Enter a 3 digit number:"); //user inputs different 3 digit number
		int number2 = scnr.nextInt();
		hundreds2 = number2 / 100;
		tens2 = (number2 - (hundreds2 * 100)) / 10;
		ones2 = (number2 - (hundreds2 * 100) - (tens2 * 10));
		
		boolean boolVar;
		boolVar = ((hundreds1 + hundreds2) == (tens1 + tens2)) && ((tens1 + tens2) == (ones1 + ones2));
		System.out.println(boolVar);
		

	}

}
