import java.util.Map;

public class Controller {

	private Map<Integer,Player> playerMap; 
	private Player currentPlayer;
	private int key=0;
	
	public Player swapPlayer(){
		if (key==0)
			this.key=1;
		else
			this.key=0;
		currentPlayer=playerMap.get(key);
		
		return currentPlayer;
	
	}
	
	
}
