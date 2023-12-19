package com.teachmeskills.lesson15.task2.figure;


public class Circle extends SquareAndPerimeter {

    public int radius;

    public Circle(String name ,int radius) {
        super(name);
        this.radius = radius;
    }

    public double Square (){
        return Math.PI * radius * radius;
    }

    public double Perimeter(){
        return 2 * Math.PI * radius;
    }

}
