package controller;

import com.sun.javafx.geom.Rectangle;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Army;
import model.Board;
import view.GameView;

public class Game extends Application {
    private ObservableList<Node> children;
    private GameView gameView;


    public static void main(String[] args) {
        Game game = new Game();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        gameView = new GameView(primaryStage,1920,1080);


        Canvas canvas = new Canvas(1280,720);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Pane root = new Pane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        initStage(primaryStage);

        Board board = new Board(16, 9);

        Army army = new Army("");

        army.setOnMouseClicked(event -> System.out.println("aloha welt"));

        board.getFields().get(34).setOccupant(army);

        double sideLength = 50;
        double xOffset = 0;
        double yOffset = 0;

        for (int i = 1; i <= board.getAmountOfFields(); i++) {
            gc.strokeRect(xOffset,yOffset,sideLength,sideLength);
            xOffset += 50;

            if (i % board.getWidth() == 0) {
                yOffset += 50;
                xOffset = 0;
            }

            if (board.getFields().get(i-1).getOccupant() != null) {
                Rectangle armyRect = new Rectangle((int)xOffset ,(int)yOffset,10,10);
                gc.setFill(Color.GREEN);
                gc.drawImage();

            }


        }




    }

    private void initStage(Stage primaryStage){
        primaryStage.setTitle("Orkriddernes Elverforbandelse");
        primaryStage.setResizable(false);
        primaryStage.setMinWidth(1280);
        primaryStage.setMinHeight(720);
        primaryStage.show();
    }
}
