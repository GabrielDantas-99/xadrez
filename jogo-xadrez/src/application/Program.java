package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// Instanciando uma partida
		ChessMatch chessMatch = new ChessMatch();
		// Imprimindo as pe�as da partida
		UI.printBoard(chessMatch.getPieces());
		
	}

}
