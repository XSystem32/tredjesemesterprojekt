package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Army extends GameObject {

    public Army() {
        Rectangle rectangle = new Rectangle(50,50);
        rectangle.setFill(Color.RED);
        children.add(rectangle);
    }


    @Override
    protected void handleMouseClick() {
        System.out.println(this + " was clicked.  " + getLayoutX() + "  "  + getLayoutY());
    }
}
