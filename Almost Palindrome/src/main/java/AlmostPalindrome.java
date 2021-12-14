import java.util.Scanner;


/*
Almost - Palindrome
A string is an almost-palindrome if, by changing only one character, you can make it a palindrome. Create a function that returns true if a string is an almost-palindrome and false otherwise.

Examples
almostPalindrome("abcdcbg") ➞ true
// Transformed to "abcdcba" by changing "g" to "a".
almostPalindrome("abccia") ➞ true
// Transformed to "abccba" by changing "i" to "b".
almostPalindrome("abcdaaa") ➞ false
// Can't be transformed to a palindrome in exactly 1 turn.

almostPalindrome("1234312") ➞ false
*/

public class AlmostPalindrome {

	public static void main(String[] args) {

		boolean running = true;

		Scanner sc = new Scanner(System.in);
		while (running) {
			System.out.println("Enter a string:");
			String input = sc.nextLine();
			almostPalindrome(input);
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

	public static void almostPalindrome(String string) {
		int count = 0;
		for (int i = 0; i < string.length()/2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - (i+1))) {
				count++;
			}
		}
		if (count < 2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
