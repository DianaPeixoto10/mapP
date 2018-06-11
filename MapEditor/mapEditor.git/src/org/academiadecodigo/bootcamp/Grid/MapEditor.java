package org.academiadecodigo.bootcamp.Grid;

/**
 * Created by codecadet on 11/06/2018.
 */
public class MapEditor {

    private FileManager fileManager;
    private Grid grid;
    private Cursor cursor;

    public MapEditor() {
        grid = new Grid();
        cursor = new Cursor(0,0);
        fileManager = new FileManager();
    }

    public void paintGridCell() {
        grid.paintCell(cursor.getRow(), cursor.getCol());
    }


    public void moveSquare(Direction direction) {

        switch (direction) {
            case UP:
                cursor.moveUp();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
        }
    }

    public void changeColor(SquareColor squareColor) {

        switch (squareColor) {
            case GREEN:
                cursor.setColorToGreen();
                break;
            case BLUE:
                cursor.setColorToBlue();
                break;
            case RED:
                cursor.setColorToRed();
                break;
            case YELLOW:
                cursor.setColorToYellow();
                break;
        }
    }

    public void save() {
        fileManager.write();
    }

    public void load() {
        fileManager.read();
    }
}
