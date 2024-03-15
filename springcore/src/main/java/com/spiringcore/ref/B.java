package com.spiringcore.ref;

public class B {
    private int y;

    // Default constructor
    public B() {
        super();
    }

    // Parameterized constructor
    public B(int y) {
        super();
        this.y = y;
    }

    // Getter and setter methods for 'y'
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
