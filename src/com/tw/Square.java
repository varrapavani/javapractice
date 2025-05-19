package com.tw;

public class Square implements Shapes {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }

    @Override
    public int perimeter() {
        return 0;
    }
}
