package com.teachmeskills.lesson15.task2.figure;


public class Rectangle extends SquareAndPerimeter {

    public int length;
    public int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double Square (){
        return length * width;
    }

    public double Perimeter (){
        return (length + width) * 2;
    }

}
