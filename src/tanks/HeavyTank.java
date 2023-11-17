package tanks;

import base.Entity;
import enums.Direction;
import gamefield.GameFieldAccessor;

public class HeavyTank extends Entity {

    public HeavyTank(int xPos, int yPos,  GameFieldAccessor gameFieldAccessor) {
        super(xPos, yPos, 30, 12, 2, 2, gameFieldAccessor);
    }

    @Override
    public void update() {

    }

    @Override
    public void Move(Direction dir) {

    }
    @Override
    public void remove() {

    }
}
