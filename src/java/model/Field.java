package model;

import javafx.scene.layout.StackPane;

public class Field {
    private GameObject terrain;
    private StackPane occupant;

    public Field(){}

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
