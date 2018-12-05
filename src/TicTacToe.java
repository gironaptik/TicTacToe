
public class TicTacToe {

	public static void main(String[] args) {
		Board b = new Board();
		System.out.println("For Reset the game Press 0");
		b.initPlayers();
		b.clearBoard();
		b.checkAndPlayMove();
	}
}
