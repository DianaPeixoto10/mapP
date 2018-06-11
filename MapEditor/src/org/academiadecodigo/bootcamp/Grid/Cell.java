package org.academiadecodigo.bootcamp.Grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 08/06/2018.
 */
public class Cell {

    Rectangle cell;
    public static final int cellSize = 25;
    private int row;
    private int col;


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        cell = new Rectangle(row * cellSize, col * cellSize, cellSize, cellSize);
        cell.setColor(Color.BLACK);
        cell.draw();
    }

    public int getCellSize() {
        return cellSize;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void paint() {
        cell.fill();
    }
}
