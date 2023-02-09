package checkersPieces;

import boardgame.Board;
import checkers.CheckersPiece;
import checkers.Color;

public class Queen extends CheckersPiece{
	public Queen(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return " O ";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		return mat;
	}
}
