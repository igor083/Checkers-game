package checkers;

import boardgame.Board;
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
		placeNewPiece('a',6,new BasePiece(board, Color.BLACK));
		placeNewPiece('a',8,new BasePiece(board, Color.BLACK));
		placeNewPiece('b',7,new BasePiece(board, Color.BLACK));
		placeNewPiece('c',6,new BasePiece(board, Color.BLACK));
		placeNewPiece('c',8,new BasePiece(board, Color.BLACK));
		placeNewPiece('d',7,new BasePiece(board, Color.BLACK));
		placeNewPiece('e',6,new BasePiece(board, Color.BLACK));
		placeNewPiece('e',8,new BasePiece(board, Color.BLACK));
		placeNewPiece('f',7,new BasePiece(board, Color.BLACK));
		placeNewPiece('g',6,new BasePiece(board, Color.BLACK));
		placeNewPiece('g',8,new BasePiece(board, Color.BLACK));
		placeNewPiece('h',7,new BasePiece(board, Color.BLACK));

		placeNewPiece('a',3,new BasePiece(board, Color.WHITE));
		placeNewPiece('a',1,new BasePiece(board, Color.WHITE));
		placeNewPiece('b',2,new BasePiece(board, Color.WHITE));
		placeNewPiece('c',3,new BasePiece(board, Color.WHITE));
		placeNewPiece('c',1,new BasePiece(board, Color.WHITE));
		placeNewPiece('d',2,new BasePiece(board, Color.WHITE));
		placeNewPiece('e',3,new BasePiece(board, Color.WHITE));
		placeNewPiece('e',1,new BasePiece(board, Color.WHITE));
		placeNewPiece('f',2,new BasePiece(board, Color.WHITE));
		placeNewPiece('g',3,new BasePiece(board, Color.WHITE));
		placeNewPiece('g',1,new BasePiece(board, Color.WHITE));
		placeNewPiece('h',2,new BasePiece(board, Color.WHITE));
		
	}

}
