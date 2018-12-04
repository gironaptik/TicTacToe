import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board {

	private int currentRow, currentCol;
	private int ROW = 3;
	private int COL = 3;
	private String[][] Position = new String[ROW][COL];
	private String currentSign = "X";
	private String result;
	private Controller c = new Controller();

	public Board(String[][] position) {
		super();
		Position = position;
	}

	public Board() {
	}

	public String[][] getPosition() {
		return Position;
	}

	public void clearBoard() {
		int count = 1;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				Position[i][j] = String.valueOf(count);
				System.out.print(" " + Position[i][j] + " ");
				count++;
			}
			System.out.println();
		}
	}

	public void printBoard() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(" " + Position[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void setPosition(String[][] position) {
		Position = position;
	}
	
	public void initPlayers() {
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Player 1, Please Enter your name: ");
		name = s.next();
		Player p1 = new Player(name, "X");
		this.c.addToMap(0, p1);
		System.out.println("Player 2, Please Enter your name: ");
		name = s.next();
		Player p2 = new Player(name, "O");
		this.c.addToMap(1, p2);
	}

	public void checkAndPlayMove() {
		int choice;
		Scanner k = new Scanner(System.in);
		while(result == null) {
		System.out.println("Please enter Your Move: ");
		choice = k.nextInt();
		convert(choice);

		while (Position[currentRow][currentCol].equals("X") || Position[currentRow][currentCol].equals("O")) {
			System.out.println("Wrong Position, Please enter new Position: ");
			choice = k.nextInt();
			convert(choice);
		}

		Position[currentRow][currentCol] = currentSign;
		printBoard();
		result = checkResult();
		currentSign = c.swapPlayer();
		}
		System.out.println(result);
		k.close();
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
		for (int i = 0; i < 8; i++) {
			String line = null;
			switch (i) {
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
				result = "X win! Congratulations " + c.nameFromMap(c.getKey());
			else if (line.equals("OOO"))
				result = "O win! Congratulations " + c.nameFromMap(c.getKey());
		}

		for (int i = 0; i < 9; i++) {

			List<String> list = new ArrayList<String>();
			for (String[] array : Position) {
				list.addAll(Arrays.asList(array));
			}

			if (list.contains(String.valueOf(i + 1))) {
				break;
			} else if (i == 8)
				result = "draw";
		}

		// System.out.println(turn + "'s turn; enter a slot number to place " +
		// turn + " in:");
		return result;
	}

}
