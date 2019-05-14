package controller;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Board;
import view.GameView;

public class Game extends Application {
    private GameView gameView;


    public static void main(String[] args) {
        Game game = new Game();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        gameView = new GameView(primaryStage,1280,720);
        ObservableList<Node> children = gameView.getChildren();

        primaryStage.setTitle("GridPane Experiment");






        Board board = new Board(12, 15);


        Scene scene = new Scene(board.getGridPane(), 600, 860);
        primaryStage.setScene(scene);
        primaryStage.show();






    }
}
