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
	private static void showBoard() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" _ ");
			}
			System.out.println();
		}
	}
	private static void makeAMove() {
		int[] index = {0,1,2,3,4,5,6,7,8};
		System.out.println("To make a move: " + index);
	}
	public static void main(String[] args) {
		char[] board = createBoard();
		chooseUserInputs();
		char person = 'X';
		char computer = '0';
		System.out.println("choosen letter by player: " + person);
		System.out.println("choosen letter by system: " + computer);
		showBoard();
		makeAMove();
	}

}
