import java.util.Scanner;

//import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {
		String name;
		Controller c = new Controller();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<2; i++) {
		System.out.println("Player "+ i +" Please Enter your name: ");
		name = s.next();
		}
		c.getBoard();
		c.updateBoard();
	}
}
