package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

// Classe para as regras do xadrez
public class ChessMatch {

	// Importanto o tabuleiro
	private Board board;

	public ChessMatch() {
		// Configurando tabuleiro para 8x8
		board = new Board(8, 8);
		initialSetup();
	}

	// Criando a matriz de peças correspondentes à partida
	public ChessPiece[][] getPieces() {

		// Variável auxiliar
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

		// Percorrendo a matriz tabuleiro e fazendo downcasting
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	// Método responsável por iniciar a partida e pôr as peças no tabuleiro
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
		placeNewPiece('c', 2, new Rook(board, Color.WHITE));
		placeNewPiece('d', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new Rook(board, Color.WHITE));
		placeNewPiece('d', 1, new King(board, Color.WHITE));
		
		placeNewPiece('c', 7, new Rook(board, Color.BLACK));
		placeNewPiece('c', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 8, new King(board, Color.BLACK));

	}

}
