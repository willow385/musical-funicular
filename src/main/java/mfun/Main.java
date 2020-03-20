package mfun;

public class Main {
    public static void main(String[] args) {
        System.out.println("foo");
        Board board = new Board();
        System.out.printf(board.toString());
        while (true) {
            board.refreshFrame();
            System.out.printf(board.toString());
        }
    }
}