package model;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class Castle extends StackPane {
    private int id;
    private String url;

    public Castle(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public Castle(int id, String url, Node... children) {
        super(children);
        this.id = id;
        this.url = url;
    }

    public Castle() {
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
