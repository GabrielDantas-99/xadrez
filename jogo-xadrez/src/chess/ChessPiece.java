package chess;

import boardgame.Board;
import boardgame.Piece;
// Script para configurar uma pe�a na partida
public class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}	
	
	
}
