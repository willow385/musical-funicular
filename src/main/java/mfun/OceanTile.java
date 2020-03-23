package mfun;

public class OceanTile extends HexTile {

    public OceanTile(int row, int column) {
        super(row, column);
    }

    public boolean isOceanTile() { return true; }

}