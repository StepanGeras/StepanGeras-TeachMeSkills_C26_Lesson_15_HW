package com.teachmeskills.lesson15.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Задача 1
 * Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
 * При заполнении коллекции числами с консоли следует делать приведения типа.
 * Код для привдения строки к числу можно использовать следующий:
 * 	int i = Integer.parseInt(str);
 * 	или
 * 	int val = Integer.valueOf(str);
 * Для окончания ввода введите слово "exit".
 * При приведении строки к числу, следует учитывать возможность исключений.
 * Некоторые полезные примеры кода для приведения строки к числу можно найти по ссылке
 * https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/
 * На экран вывести четные числа из коллекции.
 */

public class Runner {

    public static void main(String[] args) {

        List<Integer> listNumber = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter a number or to exit enter (exit) ");
                String number = scanner.nextLine();

                if (number.equals("exit")){
                    break;
                }

                if (number.contains(" ")){
                    System.out.println("You cannot enter a space");
                }

                listNumber.add(Integer.valueOf(number));

            }
        } catch (NumberFormatException e) {
            System.out.println("This is not a number");
        }

        for (Integer number : listNumber) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }



    }

}
