package Lessons_5x.Lesson_58_S_E_T;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Maxim.Rumyantsev on 14.11.2018.
 */
public class test_set {
    public static void main(String[] args) {
//        Set<Integer> hashSet1 = new HashSet<>();
//        Set<Integer> hashSet2 = new HashSet<>();
//
//        hashSet1.add(1);
//        hashSet1.add(2);
//        hashSet1.add(3);
//        hashSet1.add(4);
//        hashSet1.add(5);
//        hashSet2.add(1);
//        hashSet2.add(2);
//        hashSet2.add(3);
//        hashSet2.add(4);
//        hashSet2.add(5);
//        hashSet2.add(6);
//        hashSet2.add(7);
//
//        Set<Integer> union = new HashSet<>(hashSet1);
//        union.addAll(hashSet2);
//      //  [1, 2, 3, 4, 5] [1, 2, 3, 4, 5, 6, 7]  = [1, 2, 3, 4, 5, 6, 7]
//        System.out.println(union);
//
//        Set<Integer> retain = new HashSet<>(hashSet1);
//        retain.retainAll(hashSet2);
//     //   [1, 2, 3, 4, 5] [1, 2, 3, 4, 5, 6, 7]  = [1, 2, 3, 4, 5]
//        System.out.println(retain);
//
//        Set<Integer> remove = new HashSet<>(hashSet2);
//        remove.removeAll(hashSet2);
//      // [1, 2, 3, 4, 5, 6, 7] - [1, 2, 3, 4, 5] = [6, 7]
//        System.out.println(remove);


        Set<Integer> hashSet3 = new HashSet<>();
        Set<Integer> hashSet4 = new HashSet<>();
        Set<Integer> hashSet5= new HashSet<>();

        hashSet3.add(1);
        hashSet3.add(2);
        hashSet3.add(3);
        hashSet4.add(0);
        hashSet4.add(1);
        hashSet4.add(2);

        hashSet5= symmetricDifference(hashSet3,hashSet4);
        System.out.println(hashSet5);


    }


    public static <T> Set <T>  symmetricDifference(Set<? extends T> set1, Set<? extends T> set2)  {
        Set<T> a = new HashSet<T>();
        Set<T> b = new HashSet<T>();
        a.addAll(set1);
        a.addAll(set2);   //A+B
        b.addAll(set2);
        b.retainAll(set1);  //B-A b A-B
        a.removeAll(b); //(A+B) -( B-A + A-B )
        return  a;
    }
}



//    Реализуйте метод, вычисляющий симметрическую разность двух множеств.
//        Метод должен возвращать результат в виде нового множества. Изменять переданные
// в него множества не допускается.
//        Пример
//        Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.