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

    public static Game current;
    Board board = new Board(825, 625, 25);
    int gridSize = board.gridSize;
    int[] boardSize = board.getSize();
    int W = boardSize[0];
    int H = boardSize[1];
    Canvas canvas = new Canvas(W, H);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Head head = new Head(400, 300);
    // // boolean hasEater = false;
    // boolean gameOverTriggered = false;
    // long gameOverStartTime = 0;
    Food food = new Food();

    Body body = new Body();

    public void clear() {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, W, H);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Game.current = this;
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
        if (head.X == food.X && head.Y == food.Y) {
            body.grow(head);
            food.spawn();
        }
        if (checkCollision()) {
            System.out.println("Game Over!");
            clear();
            gc.setFill(Color.WHITE);
            gc.fillText("Game Over!", W / 2 - 40, H / 2);
            loop.stop();
        }
    }
    public boolean checkCollision() {
        // Wall collision
        if (head.X < 0 || head.Y < 0 || head.X >= W || head.Y >= H) {
            return true;
        }

        // Self collision
        for (int[] segment : body.bodyCords) {
            if (head.X == segment[0] && head.Y == segment[1]) {
                return true;
            }
        }

        return false;
    }
    
    public void render() {
        clear();
        gc.setFill(Color.RED);
        gc.fillRect(head.X, head.Y, gridSize, gridSize);
        gc.setFill(Color.BLUE);
        for (int[] segment : body.bodyCords) {
            gc.fillRect(segment[0], segment[1], gridSize, gridSize);
        }
        gc.setFill(Color.GREEN);
        gc.fillRect(food.X, food.Y, gridSize, gridSize);

        
    }
    public static void main(String[] args) {
        launch(args);
    }
}