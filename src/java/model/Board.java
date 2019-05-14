package model;

import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

// board har ansvar for at lave og være det map som alle felterne er på.
public class Board extends GameObject {
    private List<Field> fields = new ArrayList<>();
    private int amountOfFields;
    private int boardWidth;
    private int boardHight;
    private GridPane gridPane = new GridPane();

    public Board(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHight = boardHeight;
        amountOfFields = boardHeight * boardWidth;
        // laver fields og ligger på gridPane og sætter fields x(x = j) og (y=i)
        for (int i = 0; i < getBoardHeight(); i++) {
            for (int j = 0; j < getBoardWidth(); j++){
                Field field = new Field();
                field.setX(j);
                field.setY(i);
                gridPane.add(field, j,i);

            }
        }
    }

    public List<Field> getFields() {
        return fields;
    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public void setGridPane(GridPane gridPane) {
        this.gridPane = gridPane;
    }
    @Override
    protected GameObject handleMouseClick() {
        System.out.println(this + " was clicked.");
        return this;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public int getAmountOfFields() {
        return amountOfFields;
    }

    public void setAmountOfFields(int amountOfFields) {
        this.amountOfFields = amountOfFields;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public int getBoardHeight() {
        return boardHight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHight = boardHeight;
    }
}
