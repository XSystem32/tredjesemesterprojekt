package model;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

// GameObject er for at samle alle ting som skal tegnes på skærmen, så de er nemmere at behandle ensartet.
public abstract class GameObject extends StackPane {
    protected ObservableList<Node> children = this.getChildren();

    public GameObject() {
        this.setOnMouseClicked(event -> handleMouseClick());
    }


    protected GameObject handleMouseClick() {
        System.out.println(this + " was clicked.");
    return this;
    }
}
