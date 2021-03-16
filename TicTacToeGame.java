
public class TicTacToeGame {
	static char[] board = new char[10];
	
	public char[] board() {
		for(int t = 1; t < 10; t++) {
			board[t] = ' ';
		}
		return board;
	}
	
	public static void main(String[] args) {
		TicTacToeGame tictactoegame = new TicTacToeGame();
		tictactoegame.board();
	}

}
