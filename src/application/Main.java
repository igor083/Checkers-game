package application;

import java.util.Scanner;

import checkers.CheckersMatch;
import checkers.CheckersPiece;
import checkers.CheckersPosition;

public class Main {

	public static void main(String[] args) {
		CheckersMatch match = new CheckersMatch();
		Scanner sc = new Scanner(System.in);
		while (true) {
			UserInterface.printBoard(match.getPieces());
			System.out.println();
			System.out.print("Source: ");
			CheckersPosition source = UserInterface.readCheckersPosition(sc);
			System.out.println();
			System.out.print("Target: ");
			CheckersPosition target = UserInterface.readCheckersPosition(sc);
			
			CheckersPiece capturedPiece = match.performCheckersMove(source, target);
			
			
		}
	}

}
