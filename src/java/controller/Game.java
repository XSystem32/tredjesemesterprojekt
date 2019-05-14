package controller;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
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

        primaryStage.setTitle("GridPane Experiment");






        Board board = new Board(12, 15);
        Army army = new Army();


        Scene scene = new Scene(board.getGridPane(), 240, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

//        board.getFields().get(34).setOccupant(army);

        double sideLength = 50;
        double xOffset = 0;
        double yOffset = 0;

        



        children.add(army);







    }

    private void initStage(Stage primaryStage){
        primaryStage.setTitle("Orkriddernes Elverforbandelse");
        primaryStage.setResizable(false);
        primaryStage.setMinWidth(1280);
        primaryStage.setMinHeight(720);
        primaryStage.show();

    }
}
