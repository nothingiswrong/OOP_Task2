package gamefield;

import base.Entity;
import walls.Wall;

public class GameFieldAccessor {
    private GameField gameField;

    public GameFieldAccessor(GameField gameField) {
        this.gameField = gameField;
    }

    public void removeEntity(Entity entity) {
    }
    public void removeEntity(int xPos, int yPos) {

    }
    public void removeWall(Wall wall) {

    }
    public void putWall(Wall wall) {

    }
    public void putEntity(Entity entity) {

    }
    public Entity getEntity(int xPos, int yPos){
       return null;
    }
    public Wall getWall(int xPos, int yPos) {
       return null;
    }
    public int getFieldWidth() {
       return 0;
    }
    public int getFieldHeigth() {
       return 0;
    }
    public int getHeight() {
        return 0;
    }

}
