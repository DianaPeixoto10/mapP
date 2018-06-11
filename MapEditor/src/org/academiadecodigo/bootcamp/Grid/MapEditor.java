package org.academiadecodigo.bootcamp.Grid;

/**
 * Created by codecadet on 11/06/2018.
 */
public class MapEditor {

    private Grid grid;
    private Square square;

    public MapEditor() {
        grid = new Grid();
        square = new Square();
    }

    public void paintGridCell() {
        grid.paintCell(square.getRow(), square.getCol());
    }


    public void moveSquare(Direction direction) {

        switch (direction) {
            case UP:
                square.moveUp();
                break;
            case DOWN:
                square.moveDown();
                break;
            case RIGHT:
                square.moveRight();
                break;
            case LEFT:
                square.moveLeft();
                break;
        }
    }

    public void changeColor(SquareColor squareColor) {

        switch (squareColor) {
            case GREEN:
                square.setColorToGreen();
                break;
            case BLUE:
                square.setColorToBlue();
                break;
            case RED:
                square.setColorToRed();
                break;
            case YELLOW:
                square.setColorToYellow();
                break;
        }
    }

    public void save() {

    }

    public void load() {

    }
}
