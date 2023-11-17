package gamefield;

import base.Entity;
import walls.Wall;

import java.awt.*;
import java.util.ArrayList;

public class GameField {
    public ArrayList<Entity> entities;
    public ArrayList<Wall> walls;
    private Color backgroundColor;
    private int width;


    public GameField(int width, int heigth, Color backgroundColor) {
        entities = new ArrayList<Entity>();
        walls = new ArrayList<Wall>();
        this.width = width;
        this.heigth = heigth;
        this.backgroundColor = backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void addWall(Wall wall) {
        walls.add(wall);
    }
    public void addEntity(Entity entity) {
        entities.add(entity);
    }
    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    private int heigth;

}
