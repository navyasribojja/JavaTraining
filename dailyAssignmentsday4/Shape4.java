package com.java.dailyAssignmentsday4;

abstract class Shape4 {
	
    protected int x, y;

    public Shape4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public abstract void show();

    @Override
    public abstract String toString();
}
