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

}