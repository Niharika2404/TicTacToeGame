import java.util.Scanner;

public class TicTacToe {
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	private static char chooseUserInputs() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Letter1: ");
		char letter = scan.next().charAt(0);
		System.out.println("Enter the Letter2: ");
		char letter2 = scan.next().charAt(0);
		System.out.println("Choose the letter: ");
		return scan.next().toUpperCase().charAt(0);
	}
	public static void main(String[] args) {
		char[] board = createBoard();
		chooseUserInputs();
		char person = 'X';
		char computer = '0';
		System.out.println("choosen letter by player: " + person);
		System.out.println("choosen letter by system: " + computer);
	}

}
