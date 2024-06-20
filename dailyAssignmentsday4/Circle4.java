package com.java.dailyAssignmentsday4;

class Circle4 extends Shape4 {
    private int radius;
 
    public Circle4(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
 
    @Override
    public void show() {
        System.out.println(this.toString());
    }
 
    @Override
    public String toString() {
        return "Circle with center (" + x + ", " + y + ") and radius " + radius;
    }
}