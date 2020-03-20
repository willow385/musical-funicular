package mfun;

// Again, this assumes 80x24 chars to work with.
public class Frame {
    private String[] rows;

    public Frame() {
        this.rows = new String[22];
        this.rows[0] = "+";
        for (int i = 1; i < 60; i++) {
            this.rows[0] += "-";
        }
        this.rows[0] += "+";
        for (int i = 61; i < 79; i++) {
            this.rows[0] += "-";
        }
        this.rows[0] += "+\n";
        for (int y = 1; y < 21; y++) {
            this.rows[y] = "|";
            for (int x = 1; x < 60; x++) {
                this.rows[y] += " ";
            }
            this.rows[y] += "|";
            for (int x = 61; x < 79; x++) {
                this.rows[y] += " ";
            }
            this.rows[y] += "|\n";
        }
        this.rows[21] = "+";
        for (int i = 1; i < 60; i++) {
            this.rows[21] += "-";
        }
        this.rows[21] += "+";
        for (int i = 61; i < 79; i++) {
            this.rows[21] += "-";
        }
        this.rows[21] += "+\n";
    }

    @Override
    public String toString() {
        String result = "";
        for (String row : this.rows) {
            result += row;
        }
        return result;
    }

    /* Set a char at a specific point.
       c should be one char. */
    public void setCharAt(int x, int y, String c) {
        this.rows[y] =
            this.rows[y].substring(0, x)
          + c
          + this.rows[y].substring(
                x,
                this.rows[y].length()
        );
    }
}