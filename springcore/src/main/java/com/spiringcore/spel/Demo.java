package com.spiringcore.spel;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{229+11}")
    private int x;
    @Value("#{22+154+112}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(144)}")
    private int z;

    @Value("#{new java.lang.String('Hamid Shaikh')}")
    private String name;
    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    @Value("#{T(java.lang.Math).E}")
    private double e;

    @Value("#{8>3}")
    private  boolean isActive;
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", name='" + name + '\'' +
                ", e=" + e +
                ", isActive=" + isActive +
                '}';
    }
}
