package com.Fraction;

public class DotOnEdge {
    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public DotOnEdge(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public DotOnEdge(){
        x = 0;
        y = 0;
    }

    @Override
    public String toString() {
        return "(" +x+"; " + y +')';
    }
}
