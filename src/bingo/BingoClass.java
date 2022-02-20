package bingo;

public abstract class BingoClass {
	public int [][] card=new int [5][5];
	public boolean winner;
	public int[][] getCard() {
		return card;
	}
	public void setCard(int[][] card) {
		this.card = card;
	}
	public boolean isWinner() {
		return winner;
	}
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	

}
