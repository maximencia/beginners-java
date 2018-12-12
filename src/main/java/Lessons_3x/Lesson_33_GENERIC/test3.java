package Lessons_3x.Lesson_33_GENERIC;

import javafx.scene.input.KeyCode;
import org.junit.*;

import java.util.Optional;

import static javafx.scene.input.KeyCode.T;


/**
 * Created by Maxim.Rumyantsev on 19.11.2018.
 */
public class test3 implements CharSequence {

    //    Предположим, у нас есть параметризованный класс с методом someMethod:
    public static void main(String[] args) {
        Dayofweeek[] allcats = Dayofweeek.values();

        for (Dayofweeek cat : allcats) {
            System.out.println(cat);
        }

    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

//    public class Example<X> {
//        public void someMethod(Object obj) {
//            //Создание массива X
//            X[] x = new X[12];
//            //Создание экземпляра X
//            X myX = new X();
//
//            //Получение экземпляра Optional<x> через Optional.empty()
//            Optional<X> ttt = Optional.empty();
//            Optional<X> myX = Optional.empty();
//
//            //Проверка (obj instanceof X)
//            if (obj instanceof X) {
//                System.out.println("1");
//                // Проверка (obj instanceof Optional<x>)
//                if (obj instanceof Optional<X>) {
//                    System.out.println("1");
//                    System.out.println("The end");
//                }
//            }
//        }
//    }

    public class Example<X> {
        public void someMethod(Object obj) {
            //Проверка (obj instanceof Optional<x>)
//            (obj instanceof X) {
//                System.out.println("1");
//            }

            Optional<X> myX = Optional.empty();

            X pp = (X) obj;

            X[] x = (X[]) new Object[123];
        }


    }
}
//
//            //Приведение obj к типу X
//            Object obj = new X();
//
//
//
//
//
//            X ttt = new X();
//            X[] x = (X[]) new Object[123];
//            Optional<X> myX= Optional.empty();


//    Какие операции разрешены внутри метода? ("Разрешены" = "Компилятор скомпилирует")
//
//    Тест — Выберите один или несколько вариантов из списка
//    Проверка (obj instanceof X)
//    Проверка (obj instanceof Optional<x>)
//    Приведение obj к типу X
//    Создание экземпляра X
//    Создание массива X
//    Получение экземпляра Optional<x> через Optional.empty()


//        class Example1<Dayofweeek> {}
//        class Example2<CharSequence> {}
//        class Example3<? extends T> {}
//        class Example4<int> {}
//        class Example5<Object> {}
//        class Example6<42> {}
//        class Example7<Object::byte> {}
//        class Example8 {}


//    Предположим, у нас есть параметризованный класс
//
//public class Example<X> {
//    ...
//}
//    Что можно подставлять в качестве значения параметра X при использовании этого класса в программе?
//
//        Тест — Выберите один или несколько вариантов из списка
//
//        + символ "?" или более сложное выражение с ключевыми словами extends и super
//        + без <> :)  значение X можно не указывать, т.е. использовать класс Example как обычный непараметризованный
//        - ссылку на метод (например, Object::toString)
//        - имя любого примитивного типа (например, int)
//        + имя любого интерфейса (например, CharSequence)
//        - значение примитивного типа (например, 42)
//        + имя любого перечисления (например, DayOfWeek)
//        +  имя любого класса (например, Object)
//        5