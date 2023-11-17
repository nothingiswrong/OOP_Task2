package walls;

import base.BaseObject;

import java.awt.*;

public class Wall extends BaseObject {

    private Color color;

    public Color getColor() {
        return color;
    }

    public Wall(int xPos, int yPos, int width, int heigth, Color color) {
        super(xPos, yPos, width, heigth);
        this.color = color;
    }

}
