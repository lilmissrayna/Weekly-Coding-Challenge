import java.util.Scanner;
/*
 *Create a function that takes an array of numbers and returns "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

Examples
<code>sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
// 7 contains the number seven.
sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array" // None of the items contain 7 within them.
sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// 97 contains the number seven.</code>
 * */
public class BoomSeven {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to enter: ");
		String arraySizeString = sc.nextLine();
		int arraySizeInt = Integer.parseInt(arraySizeString);
		String numberArray[] = new String[arraySizeInt];
		for(int i=0;i<arraySizeInt;i++) {
			System.out.println("What would you like your number in position " + (i+1) + " to be: ");
			numberArray[i] = sc.nextLine();
		}
		boolean isSeven = seven(numberArray);
		
		if(isSeven) {
			System.out.println("Boom!");
		}else {
			System.out.println("There is no 7 in the array");	
		}
		

	}

	private static boolean seven(String[] numberString) {
		for(int i =0;i<numberString.length;i++) {
			if(numberString[i].contains("7")) {
				return true;
			}
		}
		return false;
		
	}
}
