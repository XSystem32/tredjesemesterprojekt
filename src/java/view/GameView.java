package view;

import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameView {
    private Stage primaryStage;
    private ObservableList<Node> children;
    private Group root;
    private Scene scene;
    private int width;
    private int height;

    public GameView(Stage primaryStage, int width, int height) {
        this.primaryStage = primaryStage;
        this.width = width;
        this.height = height;

        root = new Group();
        scene = new Scene(root, width, height);
        primaryStage.setScene(scene);
        children = root.getChildren();

        primaryStage.show();
    }


    public ObservableList<Node> getChildren() {
        return children;
    }

    public void setChildren(ObservableList<Node> children) {
        this.children = children;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
