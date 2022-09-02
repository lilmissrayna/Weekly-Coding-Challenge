/*
Weekly Coding Challenge:  Phone Number Word Decoder
Create a program that converts a phone number with letters to one with only numbers.
Number    Letter
0    none
1    none
2    ABC
3    DEF
4    GHI
5    JKL
6    MNO
7    PQRS
8    TUV
9    WXYZ
Examples
textToNum("123-647-EYES") ➞ "123-647-3937"
textToNum("(325)444-TEST") ➞ "(325)444-8378"
textToNum("653-TRY-THIS") ➞ "653-879-8447"
textToNum("435-224-7613") ➞ "435-224-7613"
Notes
All inputs will be formatted as a string representing a proper phone number in the format XXX-XXX-XXXX or (XXX)XXX-XXXX, using numbers and capital letters.
 */
package com.PhoneNumber;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		boolean running = true;

		Scanner sc = new Scanner(System.in);
		while (running) {
			System.out.println("Enter a phone number with letters included:");
			String numberText = sc.nextLine().toLowerCase();
			
			System.out.println(convertToNumber(numberText));
			boolean invalid = true;
			while (invalid) {
				System.out.println("Would you like to convert another number? (y/n)");
				String again = sc.nextLine();
				switch (again) {
				case "y":
					invalid = false;
					break;
				case "n":
					running = false;
					invalid = false;
					break;
				default:
					break;
				}

			}
		}
		sc.close();

	}
	
	public static String convertToNumber(String numberText) {
		String finalNumber = "";
		
		for(int i=0; i < numberText.length(); i++) {
			switch(numberText.charAt(i)) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '(':
			case ')':
			case ' ':
			case '-':
				finalNumber+=numberText.charAt(i);
				break;
			case 'A':
			case 'a':
			case 'B':
			case 'b':
			case 'C':
			case 'c':
				finalNumber+=2;
				break;
			case 'D':
			case 'd':
			case 'E':
			case 'e':
			case 'F':
			case 'f':	
				finalNumber+=3;
				break;
			case 'G':
			case 'g':
			case 'H':
			case 'h':
			case 'I':
			case 'i':	
				finalNumber+=4;
				break;
			case 'J':
			case 'j':
			case 'K':
			case 'k':
			case 'L':
			case 'l':	
				finalNumber+=5;
				break;
			case 'M':
			case 'm':
			case 'N':
			case 'n':
			case 'O':
			case 'o':	
				finalNumber+=6;
				break;
			case 'P':
			case 'p':
			case 'Q':
			case 'q':
			case 'R':
			case 'r':	
			case 'S':
			case 's':
				finalNumber+=7;
				break;
			case 'T':
			case 't':
			case 'U':
			case 'u':
			case 'V':
			case 'v':	
				finalNumber+=8;
				break;
			case 'W':
			case 'w':
			case 'X':
			case 'x':
			case 'Y':
			case 'y':	
			case 'Z':
			case 'z':
				finalNumber+=9;
				break;
			}
		}
		
		return finalNumber;
	}

}
