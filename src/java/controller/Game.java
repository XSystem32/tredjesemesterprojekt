package controller;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.stage.Stage;
import model.Army;
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



        Board board = new Board(16, 9);
        Army army = new Army();

        board.getFields().get(34).setOccupant(army);

        double sideLength = 50;
        double xOffset = 0;
        double yOffset = 0;

        


        children.add(army);





    }
}
