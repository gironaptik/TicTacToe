
public class Board {
	
	
	private int currentRow, currentCol
	private String[][] Position = new String[3][3];

	public Board(String[][] position) {
		super();
		Position = position;
	}

	public String[][] getPosition() {
		return Position;
	}

	public void setPosition(String[][] position) {
		Position = position;
	}

	public void checkAndPlayMove(int choice){
		
		
		Convert(choice);
		
	}
	
	public void checkResult(){
		
	}
	

}
