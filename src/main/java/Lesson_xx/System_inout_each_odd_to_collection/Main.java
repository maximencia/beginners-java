package Lesson_xx.System_inout_each_odd_to_collection;

/**
 * Created by Maxim.Rumyantsev on 15.11.2018.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String CHARSET = "UTF-8";



    public static void parseNums_odd_to_collect(ByteArrayInputStream inputStream, PrintStream customStream, String charset) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(inputStream);
        Double sum = 0.0;
        Integer i = 1;
        List<Integer> list = new LinkedList<>();
        while (scanner.hasNext()) {
            try {
                if (i % 2 == 0) {
                    list.add(0, scanner.nextInt());
                } else {
                    scanner.nextInt();
                }
                i++;
            } catch (InputMismatchException e) {
                scanner.next();
            }
        }


        // System.out.printf("%.6f", sum);
        System.out.println(list);
        String result = "";
        list.forEach(p->{
            System.out.print(p+" ");
            customStream.print(p+" "); // ну короче задний пробел добавили в конец строки в тесте :)


        });


    }
}


//        Напишите программу, которая прочитает из System.in последовательность целых чисел,
//        разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях,
//        и затем выведет получившуюся последовательность в обратном порядке в System.out.
//
//        Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
//
//        В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.
//
//        Sample Input:
//
//        1 2 3 4 5 6 7
//        Sample Output:
//
//        6 4 2