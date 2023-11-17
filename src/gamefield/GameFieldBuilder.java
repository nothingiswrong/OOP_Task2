package gamefield;

import walls.Wall;
import tanks.HeavyTank;
import tanks.RegularTank;
import tanks.TankTypes;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class GameFieldBuilder {
    private GameField gameField;
    private GameFieldAccessor gameFieldAccessor;

    public GameFieldBuilder(int width, int heigth) {
        this.gameField = new GameField(width, heigth, Color.WHITE);
        gameFieldAccessor = new GameFieldAccessor(gameField);
    }

    public GameField addWall(int x, int y, int width, int height, Color color) {
        gameField.addWall(new Wall(x, y, width, height, color));
        return gameField;
    }

    public GameField addTank(TankTypes type, int x, int y) {
        switch (type) {
            case HEAVY -> gameField.addEntity(new HeavyTank(x, y, gameFieldAccessor));
            case REGULAR -> gameField.addEntity(new RegularTank(x, y, gameFieldAccessor));
        }
        return gameField;
    }

    public GameField setColor(Color color) {
        gameField.setBackgroundColor(color);
        return gameField;
    }

    public GameField loadWallsFromFile(String path) throws IOException, FileNotFoundException {
        var file = new File(path);
        var scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            var s = scanner.nextLine();
            var values = s.split(" ");
            gameField.addWall(new Wall(Integer.parseInt(values[0]),
                    Integer.parseInt(values[1]),
                    Integer.parseInt(values[2]),
                    Integer.parseInt(values[3]),
                    new Color(Integer.parseInt(values[4]),
                            Integer.parseInt(values[5]),
                            Integer.parseInt(values[6])
                    )
            ));
        }
       return gameField;
    }

}
