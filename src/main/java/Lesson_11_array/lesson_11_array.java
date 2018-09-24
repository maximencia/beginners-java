package Lesson_11_array;

import java.util.Scanner;

public class lesson_11_array {
    public static void main(String[] args) {

        int number = 10;  //примитивный тип                  [10]
        char character = 'a'; //примитивный тип
        String s = "Hello";  //ссылочный тип
        String s1 = new String("Hello");
        System.out.println(s + s);
        System.out.println(s1);

        int[] numbers = new int[5];              //   numbers -> [массив]  Ссылочный тип new данных()
        numbers[1] = 100;
        System.out.println(numbers[1]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;


        }

        System.out.println(numbers);

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}

