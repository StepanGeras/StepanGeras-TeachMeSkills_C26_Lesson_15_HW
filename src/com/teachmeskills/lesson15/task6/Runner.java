package com.teachmeskills.lesson15.task6;

import java.util.HashSet;
import java.util.Set;

/**
 * Задача 6
 * Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
 * Вывести коллекцию на экран.
 */

public class Runner {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("Lisa");
        mySet.add("Andrew");
        mySet.add("Andrew");
        mySet.add("Dima");
        mySet.add("Dima");
        mySet.add("Daniil");
        mySet.add("Polina");
        mySet.add("Stepan");
        mySet.add("Ivan");
        mySet.add("Mark");
        mySet.add("Artur");
        mySet.add("Artur");
        mySet.add("Lisa");

        System.out.println(mySet);

    }

}
