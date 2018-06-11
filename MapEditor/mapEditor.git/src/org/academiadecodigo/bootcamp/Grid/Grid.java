package org.academiadecodigo.bootcamp.Grid;


import jdk.internal.util.xml.impl.Input;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 08/06/2018.
 */
public class Grid {

    private FileManager fileManager;
    private Cell[][] grid;

    public Grid() {
        grid = new Cell[30][30];
        gridConstructor();
    }

    public void gridConstructor() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                grid[row][col] = new Cell(row, col);
            }
        }
    }

    public void paintCell(int row, int col) {
        grid[row][col].paint();

    }
}

