
public class TicTacToe {
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	public static void main(String[] args) {
		char[] board = createBoard();
	}

}
