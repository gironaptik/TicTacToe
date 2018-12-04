import java.util.Map;

public class Controller {

	private Map<Integer,Player> playerMap; 
	private Board b = new Board();
	private Player currentPlayer;
	private int key=0;
	
	
	public Controller() {
	}
	
	
	public Controller(Map<Integer, Player> playerMap, Board b, Player currentPlayer, int key) {
		this.playerMap = playerMap;
		this.b = b;
		this.currentPlayer = currentPlayer;
		this.key = key;
	}


	public Player swapPlayer(){
		if (key==0)
			this.key=1;
		else
			this.key=0;
		currentPlayer=playerMap.get(key);
		return currentPlayer;
	}
	
	public void getBoard() {
		b.clearBoard();
		
	}
	
	public void updateBoard() {
		b.checkAndPlayMove();
	}
	
	
}
