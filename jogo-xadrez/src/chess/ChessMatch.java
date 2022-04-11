package chess;

import boardgame.Board;
// Classe para as regras do xadrez
public class ChessMatch {
	
	// Importanto o tabuleiro
	private Board board; 
	
	public ChessMatch() {
		// Configurando tabuleiro para 8x8
		board = new Board(8, 8);
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
	
	
}
