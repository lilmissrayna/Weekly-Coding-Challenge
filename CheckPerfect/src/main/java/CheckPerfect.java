/*
1) Create a function to find only the root value of x in any quadratic equation ax^2 + bx + c. The function will take three arguments:

a as the coefficient of x^2
b as the coefficient of x
c as the constant term

Examples
quadraticEquation(1, 2, -3) ➞ 1
quadraticEquation(2, -7, 3) ➞ 3
quadraticEquation(1, -12, -28) ➞ 14


Notes	
Quadratic equation is always guaranteed to have a root.
Check the Resources tab for more information on quadratic equations.
Calculate only the root that sums the square root of the discriminant, not the one that subtracts it.
Round the value / return only integer value.

2) Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as the sum of its factors, (equal to sum of its proper divisors) excluding the number itself.

For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.

Examples
checkPerfect(6) ➞ true
checkPerfect(28) ➞ true
checkPerfect(496) ➞ true
checkPerfect(12) ➞ false
checkPerfect(97) ➞ false
*/
import java.util.Scanner;

public class CheckPerfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Would you like to\n1 Find root value of a quadratic equation\n2 Check if number is perfect");
		String choice = sc.nextLine();
	
		if(choice.contains("1")) {
			System.out.println("Here is an example of the quadratic formula: AX^2 + BX + C\nWhat number would you like for letter\nA:");
			String a = sc.nextLine();
			System.out.println("B:");
			String b = sc.nextLine();
			System.out.println("C:");
			String c = sc.nextLine();
			System.out.println(quadraticEquation(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(c)));			
		}else if (choice.contains("2")) {
			System.out.println("What number would you like to check:");
			String perfect = sc.nextLine();
			System.out.println(checkPerfect(Integer.parseInt(perfect)));
		}else {
			System.out.println("Invalid Input");
		}

	}
	static int quadraticEquation(int a, int b, int c)
    {

        double doubleA = (double)a;
        double doubleB  = (double)b;
        double doubleC = (double)c;
        double result = (-doubleB + Math.sqrt((doubleB*doubleB) - (4*doubleA*doubleC)))/(2*doubleA);
        return (int)result;
    }
	static boolean checkPerfect(int n)
    {
		int total = 0;
		for(int i=1; i<n; i++) {
			if (n % i == 0) total += i;
		}
		
		if (total == n ) return true;
		return false;
    }
}
