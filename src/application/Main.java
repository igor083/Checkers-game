package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import checkers.CheckersException;
import checkers.CheckersMatch;
import checkers.CheckersPiece;
import checkers.CheckersPosition;

public class Main {

	public static void main(String[] args) {
		CheckersMatch match = new CheckersMatch();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				UserInterface.clearScreen();
				UserInterface.printBoard(match.getPieces());
				System.out.println();
				System.out.print("Source: ");
				CheckersPosition source = UserInterface.readCheckersPosition(sc);
				System.out.println();
				System.out.print("Target: ");
				CheckersPosition target = UserInterface.readCheckersPosition(sc);

				CheckersPiece capturedPiece = match.performCheckersMove(source, target);
			}catch (CheckersException e) {
				
				System.out.println(e.getMessage());
				sc.nextLine();
				
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
					
				
				

		}
	}

}
