package mfun;

import javax.swing.JFrame;

public class Board extends JFrame {
    public Board(HexTile[][] hexTiles) {
        this.add(new Window(hexTiles));
    }

    public void initMainLoop() {
        // TODO?
    }
}