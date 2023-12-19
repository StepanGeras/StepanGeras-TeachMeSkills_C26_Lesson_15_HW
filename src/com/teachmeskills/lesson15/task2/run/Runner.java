package com.teachmeskills.lesson15.task2.run;

import com.teachmeskills.lesson15.task2.figure.SquareAndPerimeter;
import com.teachmeskills.lesson15.task2.figure.Circle;
import com.teachmeskills.lesson15.task2.figure.Rectangle;
import com.teachmeskills.lesson15.task2.figure.Triangle;

import java.util.ArrayList;
import java.util.List;


/**
 * Задача 2
 * Создать коллекцию фигур.
 * (Классы для фигур можно взять из предыдущих домашних заданий. Использовать sealed классы не обязательно)
 * Заполнить коллекцию различными фигурами.
 * Пройти циклом по коллекции и вызвать метод для подсчета и вывода на экран периметра каждой фигуры.
 */

public class Runner {

    public static void main(String[] args) {

        List<SquareAndPerimeter> listFigure = new ArrayList<>();

        listFigure.add(new Circle("Circle", 1));
        listFigure.add(new Rectangle("Rectangle", 2, 4));
        listFigure.add(new Circle("Circle" ,4));
        listFigure.add(new Rectangle("Rectangle", 4, 6));
        listFigure.add(new Triangle("Triangle",2, 4, 5));

        for (SquareAndPerimeter c : listFigure) {
            System.out.println(c.name + " " + c.Perimeter());
        }

    }

}
