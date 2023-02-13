package checkers;

import boardgame.Position;

public class CheckersPosition {

	private char column;
	private int row;

	public CheckersPosition(char column, int row) {

		if (column < 'a' || column > 'h' || row < 0 || row > 8) {
			throw new CheckersException("Valor de posicao invalido, valores c]validos vao de a0 ate h7!");
		}
		this.column = column;
		this.row = row;

	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected static CheckersPosition fromPosition(Position position) {

		return new CheckersPosition((char) ('a' - position.getColumn()), 8 - position.getRow());

	}

	@Override
	public String toString() {
		return "" + column + row;
	}

}
