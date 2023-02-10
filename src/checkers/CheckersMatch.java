package checkers;

import boardgame.Board;
import boardgame.Piece;
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
	
	public boolean[][] possibleMoves(CheckersPosition sourcePosition){
		Position position = sourcePosition.toPosition();
		validateSourcePosition(position);
		return board.piece(position).possibleMoves();
	}
	

	private void placeNewPiece(char column, int row ,CheckersPiece cp) {
		board.placePiece(cp, new CheckersPosition(column, row).toPosition());
	}
	
	public CheckersPiece performCheckersMove(CheckersPosition sourcePosition, CheckersPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		validateSourcePosition(source);
		Piece capturedPiece = makeMove(source,target);
		return (CheckersPiece)capturedPiece;
	}
	
	private void validateSourcePosition(Position source) {
		if(!board.thereIsAPiece(source)) {
			throw new CheckersException("Nao existe peca na posicao de origem!");
		}
		if(!board.piece(source).isThereAnyPossibleMove()) {
			throw new CheckersException("Nenhum movimento possivel para esta peca");
		}
	}
	
	private Piece makeMove(Position source,Position target) {
		Piece p= board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(p, target);
		return capturedPiece;
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
