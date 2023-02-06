package application;

import checkers.CheckersMatch;

public class Main {

	public static void main(String[] args) {
		CheckersMatch match = new CheckersMatch();
		UserInterface.printBoard(match.getPieces());
	}

}
