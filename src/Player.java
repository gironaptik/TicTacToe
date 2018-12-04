import java.util.*;

public class Player {

	private String name;
	// private Map<Integer, String> userTurn;
	private String sign;

	public Player(String name, String sign) {
		super();
		this.name = name;
		this.sign = sign;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// public Map<Integer, String> getUserTurn() { //delete from model
	// return userTurn;
	// }
	// public void setUserTurn(Map<Integer, String> userTurn) {
	// this.userTurn = userTurn;
	// }
	//

}
