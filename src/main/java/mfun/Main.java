package mfun;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();

        do {
            System.out.printf(board.toString());
            String input = System.console().readLine();
            if (input.equals("end")) {
                break;
            } else {
                board.refreshFrame();
            }
        } while (true);

    }
}