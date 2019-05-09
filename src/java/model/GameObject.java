package model;

import javafx.scene.image.Image;

// GameObject er for at samle alle ting som skal tegnes på skærmen, så de er nemmere at behandle ensartet.
public abstract class GameObject extends Image {


    public GameObject(String url) {
        super("defaultImage.png");
    }
}
