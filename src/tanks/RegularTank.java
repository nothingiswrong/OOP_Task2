package tanks;

import base.Entity;
import enums.Direction;
import gamefield.GameFieldAccessor;
import projectiles.RegularBullet;

public class RegularTank extends Entity {

    public RegularTank(int xPos, int yPos, GameFieldAccessor gameFieldAccessor) {
        super(xPos, yPos, 20, 10, 10, 10, gameFieldAccessor);
    }

    @Override
    public void Move(Direction dir) {
        switch (dir) {
            case XPLUS -> xPos += xStep;
            case XMINUS -> xPos -= xStep;
            case YPLUS -> yPos += yStep;
            case YMINUS -> yPos -= yStep;
        }
    }

    @Override
    public void remove() {
        gameFieldAccessor.removeEntity(this);
    }


    public void Shoot() {
        gameFieldAccessor.putEntity(
                new RegularBullet(xPos, yPos, gameFieldAccessor, this, direction)
        );
    }


    private boolean destroyableConditionsExist() {
        return  xPos < 0
                || xPos > gameFieldAccessor.getFieldWidth()
                || yPos < 0
                || yPos > gameFieldAccessor.getFieldHeigth();
    }

    @Override
    public void update() {
        if (destroyableConditionsExist() || healthPoints <= 0) remove();
    }
}
