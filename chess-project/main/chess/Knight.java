package chess;

public class Knight extends Piece{
	private PieceColour colour;
	private String symbol;

 	public Knight(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♘";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♞";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	public	boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1) != Board.getPiece(i0, j0)) {
			return false;
		}
		else {
			return (Math.abs((i1 - i0) * (j1 - j0)) == 2);
		}
	}
}
