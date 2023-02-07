package checkers;

import boardgame.Board;
import boardgame.Position;
import checkersPieces.BasePiece;

public class CheckersMatch {

	private Board board;

	public CheckersMatch() {
		board = new Board(8, 8);// declara o tamanho do tabuleiro do jogo
		initialSetup();
	}

	public CheckersPiece[][] getPieces() {// matriz das pecas do jogo com relacao a partida
		CheckersPiece[][] mat = new CheckersPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {// percorrendo o tabuleiro
			for (int j = 0; j < board.getColumns(); j++) {

				mat[i][j] = (CheckersPiece) board.piece(i, j);// downcasting para que o programa identifique a peca como
																// checkers piece nao pelo piece generico

			}
		}
		return mat;
	}

	private void placeNewPiece(char column, int row ,CheckersPiece cp) {
		board.placePiece(cp, new CheckersPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('a',2,new BasePiece(board, Color.BLACK));
		placeNewPiece('a',3,new BasePiece(board, Color.BLACK));
		
	}

}
