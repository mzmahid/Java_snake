package org.yourcompany.yourproject;
import java.util.Random;

public class food {
    private Random rand = new Random();
    int X;
    int Y;

    public food() {
        spawn();
    }

    void spawn() {
        this.X = rand.nextInt(Board.current.gridX);
    }
}
