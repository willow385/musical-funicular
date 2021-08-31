package mfun;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Board extends JFrame {
    private HexTile[][] hexTileGrid;
    private Window windowPanel;
    private int year = 0;
    private JLabel yearCounter;
    
    public Board(HexTile[][] hexTiles) {
        this.hexTileGrid = hexTiles;
        // Window is a child of the JPanel class
        this.windowPanel = new Window(this.hexTileGrid);
        this.add(this.windowPanel);
        // This label will keep track of the year
        this.yearCounter = new JLabel("Year: 0");
        this.windowPanel.add(yearCounter);
        this.pack();
        this.setVisible(true);
    }
    
    public void initMainLoop() {
        while (true) {
            this.year++;
            this.yearCounter.setText("Year: " + this.year);
        }
    }
}
