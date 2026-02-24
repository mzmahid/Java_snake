package org.yourcompany.yourproject;

public class Board {
    public static Board current; 
    int gridSize;
    int W;
    int H;
    int gridX;
    int gridY;

    public Board(int x, int y, int gridSize) {
        this.W = x;
        this.H = y;
        this.gridSize = gridSize;
        this.gridX = W / gridSize;
        this.gridY = H / gridSize;
        current = this;
    }
    

    public int[] getSize() {
        return new int[] {this.W, this.H};
    }
}
