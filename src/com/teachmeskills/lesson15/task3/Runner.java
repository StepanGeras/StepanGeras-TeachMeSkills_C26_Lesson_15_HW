package com.teachmeskills.lesson15.task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Задача 3
 * Создать коллекцию целых чисел.
 * Заполните коллекцию рандомными числами.
 * Пусть размер коллекции задается с консоли.
 * Предусмотреть возможно ошибок при получении размера коллекции с консоли.
 * Предусмотреть проверку введенного размера коллекции на валидность.
 * Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
 */

public class Runner {

    public static void main(String[] args) {

        try {

            int min = 0;
            int max = 10;
            int count = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter size list");

            int size = scanner.nextInt();

            List<Integer> listNumber = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                listNumber.add((int) (Math.random() * max - min));
                count += listNumber.get(i);
            }

            System.out.println(listNumber);

            System.out.println(count/size);

        } catch (InputMismatchException e){
            System.out.println("The size is not correction");
        }

    }

}
