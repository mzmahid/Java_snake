package org.yourcompany.yourproject;
import java.util.Random;

public class Food {
    private Random rand = new Random();
    int X;
    int Y;

    public Food() {
        spawn();
    }

    void spawn() {
        while (true) {
            this.X = rand.nextInt(Board.current.gridX) * Board.current.gridSize;
            this.Y = rand.nextInt(Board.current.gridY) * Board.current.gridSize;

            // Check collision with head
            if (Game.current != null) {
                Head head = Game.current.head;
                if (head.X == this.X && head.Y == this.Y) continue;

                // Check collision with body
                boolean overlapsBody = false;
                for (int[] segment : Game.current.body.bodyCords) {
                    if (segment[0] == this.X && segment[1] == this.Y) {
                        overlapsBody = true;
                        break;
                    }
                }
                if (overlapsBody) continue;
            }

            break; // valid spawn location found
        }
    }
}
