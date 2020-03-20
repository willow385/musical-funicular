package mfun;

public class Board {
    private int width;
    private int height;
    private Frame frame;

    // By default this will assume 80x24 chars.
    public Board() {
        this.width  = 80;
        this.height = 22;
        this.frame = new Frame();
    }

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.frame = new Frame();
    }

    @Override
    public String toString() {
        return this.frame.toString() + "mfun >> ";
    }

    public void refreshFrame() {
        // TODO
        for (int i = 0; i < this.height; i++) {
            System.out.printf("\033[A");
        }
    }

}