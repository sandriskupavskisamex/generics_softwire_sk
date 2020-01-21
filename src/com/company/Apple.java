package com.company;

public class Apple implements Countable {

    String color;
    public int getCount() {
        return 1;
    }

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
