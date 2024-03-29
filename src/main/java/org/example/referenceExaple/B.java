package org.example.referenceExaple;

public class B {
    public B() {
        super();
    }

    private int y;

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
