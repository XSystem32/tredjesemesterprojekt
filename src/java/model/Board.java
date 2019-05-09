package model;

import java.util.ArrayList;
import java.util.List;

// board har ansvar for at lave og være det map som alle felterne er på.
public class Board {
    private List<Field> fields = new ArrayList<>();
    private int amountOfFields;
    private int width;
    private int height;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        amountOfFields = width * height;

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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
