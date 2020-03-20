package mfun;

// Again, this assumes 80x24 chars to work with.
public class Frame {
    private String[] rows;

    public Frame() {
        this.rows = new String[24];
        this.rows[0] = "+";
        for (int i = 1; i < 60; i++) {
            this.rows[0] += "-";
        }
        this.rows[0] += "+";
        for (int i = 61; i < 80; i++) {
            this.rows[0] += "-";
        }
        this.rows[0] += "+\n";
        for (int y = 1; y < 23; y++) {
            this.rows[y] += "|";
            for (int x = 1; x < 60; x++) {
                this.rows[y] += " ";
            }
            this.rows[y] += "|";
            for (int x = 61; x < 80; x++) {
                this.rows[y] += " ";
            }
            this.rows[y] += "|\n";
        }
        this.rows[23] = "+";
        for (int i = 1; i < 60; i++) {
            this.rows[23] += "-";
        }
        this.rows[23] += "+";
        for (int i = 61; i < 80; i++) {
            this.rows[23] += "-";
        }
        this.rows[23] += "+\n";
    }

    @Override
    public String toString() {
        String result = "";
        for (String row : this.rows) {
            result += row;
        }
        return result;
    }
}