package base;

import enums.Direction;
import gamefield.GameFieldAccessor;

public abstract class Entity extends BaseObject {
    protected int yStep;
    protected int xStep;

    protected int healthPoints;

    protected GameFieldAccessor gameFieldAccessor;

    protected Direction direction;

    public Entity(int xPos, int yPos, int width, int heigth, int xStep, int yStep, GameFieldAccessor gameFieldAccessor) {
        super(xPos, yPos, width, heigth);
        this.xStep = xStep;
        this.yStep = yStep;
        this.gameFieldAccessor = gameFieldAccessor;
        direction = Direction.YMINUS;
    }

    public int getyStep() {
        return yStep;
    }

    public int getxStep() {
        return xStep;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public abstract void Move(Direction dir);

    public void increaseHealthPoints(int k) {
        healthPoints += k;
    }
    public void decreaseHealthPoints(int k) {
        healthPoints -= k;
    }
    public abstract void update();
    public abstract void remove();
}
