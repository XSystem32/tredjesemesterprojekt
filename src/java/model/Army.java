package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Army extends GameObject {

    public Army() {
        Rectangle rectangle = new Rectangle(0,0,100,100);
        rectangle.setFill(Color.CYAN);
        children.add(rectangle);
    }


    @Override
    protected GameObject handleMouseClick() {
        System.out.println(this + " was clicked.");
        return this;
    }
}
