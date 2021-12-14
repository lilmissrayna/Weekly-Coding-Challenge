import java.util.Scanner;

/*
Staircase of Recursion
Write a function that returns the number of ways a person can climb n stairs, where the person may only climb 1 or 2 steps at a time.

To illustrate, if n = 4 there are 5 ways to climb:

[1, 1, 1, 1]
[2, 1, 1]
[1, 2, 1]
[1, 1, 2]
[2, 2]
Examples
waysToClimb(1) ➞ 1
waysToClimb(2) ➞ 2
waysToClimb(5) ➞ 8

Notes
A staircase of height 0 should return 1.
 */
public class StaircaseOfRecursion {
	public static int count;

	public static void main(String[] args) {
		boolean running = true;

		Scanner sc = new Scanner(System.in);
		while (running) {
			count = 0;
			System.out.println("Enter how many stairs:");
			String input = sc.nextLine();
			waysToClimb(Integer.parseInt(input));
			System.out.println(count);
			boolean invalid = true;
			while (invalid) {
				System.out.println("Would you like to enter a new number of stairs? (y/n)");
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

	private static void waysToClimb(int input) {
		if(input == 1 || (count==0 && input==0)) {
			count++;
		} else if (input ==2) {
			count += 2;
		}else {
			waysToClimb(input-1);
			waysToClimb(input-2);
		}
	}

}
