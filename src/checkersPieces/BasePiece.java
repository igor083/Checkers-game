package checkersPieces;

import boardgame.Board;
import checkers.CheckersPiece;
import checkers.Color;

public class BasePiece extends CheckersPiece {

	public BasePiece(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return " O";
	}
	
	
	
}
