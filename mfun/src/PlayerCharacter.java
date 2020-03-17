package mfun;

import mfun.Direction;

public class PlayerCharacter {

    // TODO: more javadoc comments

    private String name;
    private Direction dir;

    public PlayerCharacter() {
        this.name = "Sammy";
        this.dir = Direction.RIGHT;
    }

    public PlayerCharacter(String name) {
        this.name = name;
        this.dir = Direction.RIGHT;
    }

    public void changeDirection(Direction d) {
        this.dir = d;
    }

}