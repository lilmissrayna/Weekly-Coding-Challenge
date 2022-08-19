/*
Weekly Coding Challenge: Palindrome Given a word, create a function that returns whether or not it's possible to create a palindrome by rearranging the letters in the word.

Examples 
isPalindromePossible("rearcac") ➞ true
// You can make "racecar"
isPalindromePossible("suhbeusheff") ➞ true
// You can make "sfuehbheufs" (not a real word but still a palindrome)
isPalindromePossible("palindrome") ➞ false
// It's impossible

Notes 
Trivially, words that are already palindromes return true.	
Words are given in all lowercase.
 */
package com.Palindrome;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		boolean running = true;

		Scanner sc = new Scanner(System.in);
		while (running) {
			System.out.println("Enter a string:");
			String input = sc.nextLine();
			System.out.println(isPalindrome(input));
			boolean invalid = true;
			while (invalid) {
				System.out.println("Would you like to enter another string? (y/n)");
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

	public static boolean isPalindrome(String str) {

		int count[] = new int[NO_OF_CHARS];
		Arrays.fill(count, 0);

		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			count[(int) (str.charAt(i))]++;
		}
		int odd = 0;
		for (int i = 0; i < NO_OF_CHARS; i++) {
			if ((count[i] & 1) == 1)
				odd++;

			if (odd > 1)
				return false;
		}

		return true;
	}
}
