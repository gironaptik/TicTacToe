import java.util.HashMap;

public class Controller {

	private HashMap<Integer,Player> playerMap= new HashMap<Integer,Player>();
	private int key=0;
	
	
	public Controller() {
	}

	public void addToMap(int k, Player p) {
		playerMap.put(k, p);
		
	}
	public int getKey() {
		return key;
	}
	public String nameFromMap(int k) {
		return playerMap.get(k).getName();
	}
	public String swapPlayer(){
		String sign;
		if (key==0)
			this.key=1;
		else
			this.key=0;
		sign=playerMap.get(key).getSign();
		return sign;
	}
	
	
	
}
