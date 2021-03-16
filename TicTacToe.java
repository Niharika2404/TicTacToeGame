import java.util.Scanner;

public class TicTacToe {
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int t = 0; t < board.length; t++) {
			board[t] = ' ';
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
		int i ;
		int j;
		System.out.println("To make a move: ");
		if (i = 0) 
			System.out.println("There is a free space");
		else
			System.out.println("There is not a free space");
		
		System.out.println("Good to go for the free space");
	}
	private static void checkFreeSpace() {
		makeAMove();
		if (char tij == ' ')
			System.out.println("Space is empty, can make a move");
		else
			System.out.println("space is not empty, look for another space");
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
		checkFreeSpace();
	}

}
