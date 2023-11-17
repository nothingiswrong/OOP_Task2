package projectiles;

import base.Entity;
import enums.Direction;
import gamefield.GameFieldAccessor;

public class RegularBullet extends Entity {

    private int damage = 30;
    private int xBlastDist = 5;
    private int yBlastDist = 5;
    private Entity sender;


    private Direction shootDir;

    public RegularBullet(int xPos, int yPos,
                         GameFieldAccessor gameFieldAccessor,
                         Entity sender, Direction shootDir) {
        super(xPos, yPos, 5, 5, 100, 100, gameFieldAccessor);
        this.sender = sender;
        this.shootDir = shootDir;
    }


    public int getDamage() {
        return damage;
    }

    public int getxBlastDist() {
        return xBlastDist;
    }

    public int getyBlastDist() {
        return yBlastDist;
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

    @Override
    public void update() {
        if (gameFieldAccessor.getEntity(xPos, yPos) != null) {
            gameFieldAccessor.getEntity(xPos, yPos).decreaseHealthPoints(damage);
        } else if (destroyableConditionsExist()) {
            remove();
        }
        Move(shootDir);
    }

    private boolean destroyableConditionsExist() {
        return gameFieldAccessor.getWall(xPos, yPos) != null
                || xPos < 0
                || xPos > gameFieldAccessor.getFieldWidth()
                || yPos < 0
                || yPos > gameFieldAccessor.getFieldHeigth();
    }
}
