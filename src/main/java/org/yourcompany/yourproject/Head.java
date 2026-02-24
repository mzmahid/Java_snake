package org.yourcompany.yourproject;

public class Head {

    public Head(int x, int y) {
        this.X = x;
        this.Y = y;
    }
    

    int X;
    int Y;
    int[] motionVec = new int[2];
    int[] old_pos = new int[2];

    public void setPos(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int[] getPos() {
        return new int[]{this.X, this.Y};
    }
    
    public void setDirection(String direction) {
        switch (direction) {
            case "UP" -> {
                this.motionVec[0] = 0;
                this.motionVec[1] = -1;
            }
            case "DOWN" -> {
                this.motionVec[0] = 0;
                this.motionVec[1] = 1;
            }
            case "RIGHT" -> {
                this.motionVec[0] = 1;
                this.motionVec[1] = 0;
            }
            case "LEFT" -> {
                this.motionVec[0] = -1;
                this.motionVec[1] = 0;
            }
        }
    }

    public void move(int speed) {
        old_pos = new int[] {this.X, this.Y};
        this.X += speed * this.motionVec[0];
        this.Y += speed * this.motionVec[1];
    }

}
