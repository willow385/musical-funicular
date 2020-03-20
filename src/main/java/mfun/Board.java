package mfun;

public class Board {
    private int width;
    private int height;
    private Frame frame;

    // By default this will assume 80x24 chars.
    public Board() {
        this.width  = 80;
        this.height = 24;
    }

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return this.frame.toString();
    }

    public void refreshFrame() {
        // TODO
    }
}