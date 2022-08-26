/*
Create a function that takes the name of a chess piece, its position and a target position.
The function should return true if the piece can move to the target and false if it can't.

The possible inputs are "Pawn", "Knight", "Bishop", "Rook", "Queen" and "King".

Examples
canMove("Rook", "A8", "H8") ➞ true
canMove("Bishop", "A7", "G1") ➞ true
canMove("Queen", "C4", "D6") ➞ false

Notes
Do not include pawn capture moves and en passant.
Do not include castling.
Remember to include pawns' two-square move on the second rank!
Look for patterns in the movement of the pieces.
*/
package com.chess;
import java.lang.Math;
import java.util.Scanner;

public class chess {

	public static void main(String[] args) {
		boolean running = true;

		Scanner sc = new Scanner(System.in);
		while (running) {
			System.out.println("Enter a piece name from the list:\nPawn\nKnight\nBishop\nRook\nQueen\nKing");
			String piece = sc.nextLine().toLowerCase();
			
			System.out.println("Enter a starting location for this piece:");
			String start = sc.nextLine().toLowerCase();
			
			System.out.println("Enter an ending location for this piece:");
			String end = sc.nextLine().toLowerCase();
			
			System.out.println(canMove(piece,start,end));
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
	
	public static boolean canMove(String piece, String starting, String ending) {
		char startcolumn = starting.charAt(0);
	    int startspot = starting.charAt(1);
	    char endcolumn = ending.charAt(0);
	    int endspot = ending.charAt(1);
		if(piece.equals("pawn")) {
			if(startcolumn == endcolumn && Math.abs(endspot-startspot)<=2) {
				return true;
			}else {
				return false;
			}
		}else if(piece.equals("knight")) {
			if ((Math.abs(startcolumn - endcolumn) == 2 && Math.abs(startspot - endspot) == 1) || (Math.abs(startspot - endspot) == 2 && Math.abs(startcolumn - endcolumn) == 2 && Math.abs(startspot - endspot) == 1)){
		        return true;
		      } else {
		    	  return false;
		      }
		}else if(piece.equals("bishop")) {
			if( Math.abs(startcolumn - endcolumn) == Math.abs(startspot - endspot)) {
				return true;	
			}else {
				return false;
			}
		}else if(piece.equals("rook")) {
			if(startcolumn == endcolumn || startspot==endspot) {
				return true;
			}else {
				return false;
			}
		}else if(piece.equals("queen")) {
			if(startcolumn == endcolumn || startspot==endspot || Math.abs(startcolumn - endcolumn) == Math.abs(startspot - endspot)) {
				return true;
			}else {
				return false;
			}
		}else if(piece.equals("king")) {
			if((startcolumn == endcolumn && Math.abs(endspot-startspot)==1)|| (startspot==endspot && Math.abs(startcolumn-endcolumn)==1)|| (Math.abs(startcolumn - endcolumn)==1 && Math.abs(startspot - endspot)==1)) {
				return true;
			}else {
				return false;
			}
		}else {
			System.out.println("Invalid input.");
		}
		return false;
	}

}
