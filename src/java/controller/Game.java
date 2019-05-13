package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Army;
import model.Board;

public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


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
                gc.drawImage(new Image("defaultImage.png"),xOffset,yOffset);
                //gc.setFill(Color.GREEN);
                //gc.fillRect(xOffset,yOffset, 30,30);
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
