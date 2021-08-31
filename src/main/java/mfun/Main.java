package mfun;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main {

    private static HexTile[][] hexTiles;
    private static final int hexTileColumns = 30;
    private static final int hexTileRows = 20;

    public static void main(String[] args) {

        hexTiles = new HexTile[hexTileColumns][];
        for (int y = 0; y < hexTileColumns; y++) {
            hexTiles[y] = new HexTile[hexTileRows];
            for (int x = 0; x < hexTileRows; x++) {
                hexTiles[y][x] = new HexTile(x, y);
            }
        }

        Board gameBoard = new Board(hexTiles);
        gameBoard.setSize(800, 600);
        gameBoard.setTitle("Musical Funicular");
        gameBoard.setLocationRelativeTo(null);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setVisible(true);
        gameBoard.initMainLoop();
    }
}