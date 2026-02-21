package org.yourcompany.yourproject;

public class Board {
    int gridSize = 25;
    int W = 825;
    int H = 625;
    // int n = 20; 

    public Board(int x, int y) {
        this.W = x;
        this.H = y;
    }
    

    public int[] getSize() {
        return new int[] {this.W, this.H};
    }
}
