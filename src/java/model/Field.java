package model;

import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Field extends GameObject {
    private GameObject terrain;
    private StackPane occupant;
    private int x;
    private int y;

    public Field(){
        Rectangle rectangle = new Rectangle(50,50, Color.WHEAT);
        children.add(rectangle);

        this.paddingProperty().setValue(new Insets(1,1,1,1));
    }

    @Override
    protected GameObject handleMouseClick() {
        System.out.println(this.getX() + "," + this.getY());
        return this;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public GameObject getTerrain() {
        return terrain;
    }

    public void setTerrain(GameObject terrain) {
        this.terrain = terrain;
    }

    public StackPane getOccupant() {
        return occupant;
    }

    public void setOccupant(StackPane occupant) {
        this.occupant = occupant;
    }


}
