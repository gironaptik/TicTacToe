

public class Player {

	private String name;
	private String sign;

	public Player(String name, String sign) {
		super();
		this.name = name;
		this.sign = sign;
	}
	
	public Player() {
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


}
