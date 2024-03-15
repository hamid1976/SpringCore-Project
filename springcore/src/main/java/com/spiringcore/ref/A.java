package com.spiringcore.ref;

public class A {
    private int x;
    private B ob;

    // Default constructor
    public A() {
        super();
    }

    // Parameterized constructor
    public A(int x, B ob) {
        super();
        this.x = x;
        this.ob = ob;
    }

    // Getter and setter methods for 'x'
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter and setter methods for 'ob'
    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
