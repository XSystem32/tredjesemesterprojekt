package model;

import java.util.ArrayList;
import java.util.List;

// board har ansvar for at lave og være det map som alle felterne er på.
public class Board extends GameObject {
    private List<Field> fields = new ArrayList<>();
    private int amountOfFields;
    private int boardWidth;
    private int boardHight;

    public Board(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHight = boardHeight;
        amountOfFields = boardHeight * boardWidth;

        for (int i = 0; i < amountOfFields; i++) {
            fields.add(new Field());
        }
    }

    public List<Field> getFields() {
        return fields;
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
