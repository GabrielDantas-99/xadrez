package chess;

import boardgame.Board;
import boardgame.Position;
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
	public ChessPiece[][] getPieces(){
		
		// Variável auxiliar
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		// Percorrendo a matriz tabuleiro e fazendo downcasting
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	// Método responsável por iniciar a partida e pôr as peças no tabuleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
	}
	
}
