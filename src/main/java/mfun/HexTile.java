package mfun;

public class HexTile {

    private int row;
    private int column;

    public HexTile(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getXPos() {
        return 24 + 18 * this.column;
    }

    public int getYPos() {
        if (this.column % 2 == 0) {
            return 24 * (this.row + 1);
        } else {
            return 12 + 24 * (this.row + 1);
        }
    }

    public boolean isEvenNumberedColumn() {
        return (this.column % 2 == 0);
    }

    public boolean contains(int x, int y) {
        /* TODO this function only returns true
         * if x and y are within the rectangular
         * area between the top face and bottom
         * face of a given hex tile. */
        int thisXPos = this.getXPos();
        int thisYPos = this.getYPos();
        return (
            x >= thisXPos && x <= thisXPos + 12
        &&
            y >= thisYPos && y <= thisYPos + 18
        );
    }
}