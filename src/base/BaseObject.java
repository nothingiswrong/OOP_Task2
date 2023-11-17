package base;

public abstract class BaseObject {
    protected int xPos;
    protected int yPos;
    protected int width;
    protected int heigth;

    protected int healthPoints;
    public BaseObject(int xPos, int yPos, int width, int heigth) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.heigth = heigth;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
    public void increaseHealthPoints(int k) {
        healthPoints += k;
    }
    public void decreaseHealthPoints(int k) {
        healthPoints -= k;
    }
    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }
}
