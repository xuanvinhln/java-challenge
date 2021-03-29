package challenge.design_patterns.creational_patterns.prototype.board_ex;

public class PrototypeExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		Board chessBoard = new Board();

		long endTime = System.currentTimeMillis();

		System.out.println("Time taken to create a board: " + (endTime - startTime) + " millis");

		chessBoard.print();
	}
}
