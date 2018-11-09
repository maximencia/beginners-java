package Lessons_5x.Lesson_54_ArrayList_3;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://www.udemy.com/javarussia/learn/v4/t/lecture/8982078?start=0
public class test {


    public static void main(String[] args) {
       List<Integer> list = new LinkedList<>();
       List<Integer> arraylist = new ArrayList<>();

        System.out.println("measureTime_1");
       measureTime_1(list);
      measureTime_1 (arraylist);
        System.out.println("measureTime_2");
      measureTime_2(list);
      measureTime_2(arraylist);
      System.out.println("measureTime_3");
      measureTime_3(list);
      measureTime_3(arraylist);

        System.out.println("the End.");


    }
    // запись в конец листа
    private static void measureTime_1(List<Integer> list) {
        long start  = System.currentTimeMillis();


        for (int i =0 ; i<1000000000; i++)
        {list.add(i);}
        long end =  System.currentTimeMillis();
        System.out.println(end - start);

    }
    // чтение элементов
    private static void measureTime_2(List<Integer> list) {

        for (int i =0 ; i<100000; i++)
        {list.add(i);}

        long start  = System.currentTimeMillis();

        for (int i =0 ; i<100000; i++)
        {list.get (i);}


        long end =  System.currentTimeMillis();
        System.out.println(end - start);

    }
    // запись в начало листа
    private static void measureTime_3(List<Integer> list) {
        long start  = System.currentTimeMillis();

        for (int i =0 ; i<100000; i++)
        {list.add(0,i);}

        long end =  System.currentTimeMillis();
        System.out.println(end - start);
    }
}


//
//    при measureTime_1  = 1000000000
//    Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
//        at java.lang.Integer.valueOf(Integer.java:832)
//        at Lessons_5x.Lesson_54_ArrayList_3.test.measureTime_1(test.java:36)
//        at Lessons_5x.Lesson_54_ArrayList_3.test.main(test.java:17)
//

//        measureTime_1 10000000
//    l    12360
//    a    8298

//        measureTime_1 100000
//    l    10
//    a    7
//        measureTime_2
//    l    17787
//    a    3
//        measureTime_3
//    l    13
//    a    5019
//
//   the End.

//запись в конец и считытывание - arraylist
//добавление в начало лиса или удаление элементов - linkedlist