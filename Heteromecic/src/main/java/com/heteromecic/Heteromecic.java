package com.heteromecic;

import java.util.Scanner;

/*
A pronic number (or otherwise called as heteromecic) is a number which is a product of two consecutive integers,
that is, a number of the form n(n + 1). Create a function that determines whether a number is pronic or not.

Examples
isHeteromecic(0) ➞ true
// 0 (0 + 1) = 0 1 = 0

isHeteromecic(2) ➞ true
// 1 (1 + 1) = 1 2 = 2

isHeteromecic(7) ➞ false

isHeteromecic(110) ➞ true
// 10 (10 + 1) = 10 11 = 110

isHeteromecic(136) ➞ false

isHeteromecic(156) ➞ true
 */
public class Heteromecic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		String numberString = sc.nextLine();

		boolean pronic = isHeteronomecic(Integer.parseInt(numberString));
		System.out.println(pronic);
	}

	private static boolean isHeteronomecic(int number) {
		int total=0;
		for (int i = 0; total <= number; i++) {
			total = i*(i+1);
			if(total==number) {
				return true;
			}
		}
		
		return false;

	}

}
