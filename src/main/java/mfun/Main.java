package mfun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf(board.toString());
            String input = "end";
            if (input.equals("end")) {
                break;
            } else {
                board.refreshFrame();
            }
        } while (sc.hasNext());

    }
}