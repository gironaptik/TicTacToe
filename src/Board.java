
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
	
	
	public void checkResult() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = Position[0][0] + Position[0][1] + Position[0][2];
				break;
			case 1:
				line = Position[1][0] + Position[1][1] + Position[1][2];
				break;
			case 2:
				line = Position[2][0] + Position[2][1] + Position[2][2];
				break;
			case 3:
				line = Position[0][0] + Position[1][0] + Position[2][0];
				break;
			case 4:
				line = Position[0][1] + Position[1][1] + Position[2][1];
				break;
			case 5:
				line = Position[0][2] + Position[1][2] + Position[2][2];
				break;
			case 6:
				line = Position[0][0] + Position[1][1] + Position[2][2];
				break;
			case 7:
				line = Position[0][2] + Position[1][1] + Position[2][0];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}
	

}
