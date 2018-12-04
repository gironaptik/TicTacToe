import java.util.Arrays;

public class Board {

	private int currentRow, currentCol;
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

	public void checkAndPlayMove(int choice) {
		convert(choice);

	}

	private void convert(int choice) {
		switch (choice) {
		case 1:
			this.currentRow = 0;
			this.currentCol = 0;
			break;
		case 2:
			this.currentRow = 0;
			this.currentCol = 1;
			break;
		case 3:
			this.currentRow = 0;
			this.currentCol = 2;
			break;
		case 4:
			this.currentRow = 1;
			this.currentCol = 0;
			break;
		case 5:
			this.currentRow = 1;
			this.currentCol = 1;
			break;
		case 6:
			this.currentRow = 1;
			this.currentCol = 2;
			break;
		case 7:
			this.currentRow = 2;
			this.currentCol = 0;
			break;
		case 8:
			this.currentRow = 2;
			this.currentCol = 1;
			break;
		case 9:
			this.currentRow = 2;
			this.currentCol = 2;
			break;
		}

	}

	public String checkResult() {
		String result = null;
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
			if (line.equals("XXX"))
				result = "X win!";
			else if (line.equals("OOO"))
				result = "O win!";
		}
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(Position).contains(String.valueOf(a + 1))) {
				break;
			} else if (a == 8)
				result= "draw";
		}

		// System.out.println(turn + "'s turn; enter a slot number to place " +
		// turn + " in:");
		return result;
	}

}
