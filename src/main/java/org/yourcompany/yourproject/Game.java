package org.yourcompany.yourproject;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {

    Board board = new Board(825, 625);
    int gridSize = board.gridSize;
    int[] boardSize = board.getSize();
    int W = boardSize[0];
    int H = boardSize[1];
    Canvas canvas = new Canvas(W, H);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Head head = new Head(400, 0);
    boolean hasEater = false;

    Body body = new Body();

    public void clear() {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, W, H);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane(canvas);
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case W -> head.setDirection("UP");
                case A -> head.setDirection("LEFT");
                case S -> head.setDirection("DOWN");
                case D -> head.setDirection("RIGHT");

                case X -> body.grow(head);
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake Game");
        primaryStage.show();
        loop.start();
    }
    private long lastUpdate = 0;
    private final long INTERVAL = 2000_000_00L; 
    AnimationTimer loop = new AnimationTimer() {
        @Override
        public void handle(long now) {
            if(now - lastUpdate >= INTERVAL) {
                render();
                update();
                lastUpdate = now;
            }
        }
    };

    public void update() {
        head.move(gridSize);
        body.move(head);
    }

    public void render() {
        clear();
        gc.setFill(Color.RED);
        gc.fillRect(head.X, head.Y, gridSize, gridSize);
        gc.setFill(Color.BLUE);
        for (int[] segment : body.bodyCords) {
            gc.fillRect(segment[0], segment[1], gridSize, gridSize);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}