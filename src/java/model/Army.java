package model;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Army extends GameObject {
    private ObservableList<Node> children;
    private Rectangle rectangle;


    public Army() {
        rectangle = new Rectangle(0,0,100,100);
        rectangle.setFill(Color.CYAN);
        children = this.getChildren();
        children.add(rectangle);

        this.setOnMouseClicked(event -> System.out.println(this + " was clicked"));

    }




}
