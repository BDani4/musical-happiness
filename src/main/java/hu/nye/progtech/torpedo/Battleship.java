package hu.nye.progtech.torpedo;

public class Battleship {
    public int x1;
    int y1;
    int x2;
    int y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    @Override
    public String toString() {
        return  "X: " + x1 + " " + y1 + "\n" + "Y: " + x2 + " " + y2;
    }
}
