package controller;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Army;
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



        Army army = new Army();
        Army otherArmy = new Army();
        Army thirdArmy = new Army();
        Army fourthArmy = new Army();
        Army firstArmy = new Army();



        GridPane gridPane = new GridPane();
        gridPane.setMinSize(800, 800);
        gridPane.setPadding(new Insets(10, 10, 10, 10));


        gridPane.add(fourthArmy,50,400);
        gridPane.add(otherArmy,30,700);
        gridPane.add(thirdArmy,800,100);
        gridPane.add(firstArmy,700,500);

        Scene scene = new Scene(gridPane);

        primaryStage.setScene(scene);
        primaryStage.show();

        children.add(army);





    }
}
