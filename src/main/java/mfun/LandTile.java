package mfun;

public class LandTile extends HexTile {

    private boolean city;
    private boolean farm;

    public LandTile(int row, int column) {
        super(row, column);
        this.city = false;
        this.farm = false;
    }

    public boolean hasCity() {
        return this.city;
    }

    public boolean hasFarm() {
        return this.farm;
    }

    public boolean establishCity() {
        if (!this.farm && !this.city) {
            this.city = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean establishFarm() {
        if (!this.farm && !this.city) {
            this.farm = true;
            return true;
        } else {
            return false;
        }
    }

}