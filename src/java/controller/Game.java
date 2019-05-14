package controller;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
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



        Board board = new Board(10, 10);

        Army army = new Army();
        Army otherArmy = new Army();
        Army thirdArmy = new Army();
        Army fourthArmy = new Army();
        Army firstArmy = new Army();



        board.getGridPane().setPadding(new Insets(10, 10, 10, 10));


        board.getGridPane().add(fourthArmy,1,3);
        board.getGridPane().add(otherArmy,3,5);
        board.getGridPane().add(thirdArmy,5,8);
        board.getGridPane().add(firstArmy,7,3);

        Scene scene = new Scene(board.getGridPane(), 550, 550);


        primaryStage.setScene(scene);
        primaryStage.show();

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
