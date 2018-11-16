package Lessons_5x.Lesson_58_S_E_T;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Maxim.Rumyantsev on 14.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        //  порядок сохранения и извлечения такойже как и для ьфзъ


        hashSet.add("Bob6");
        hashSet.add("Bob7");
        hashSet.add("Bob5");
        hashSet.add("Bob1");
        hashSet.add("Bob2");

//        for (String name : hashSet) {
//            System.out.println(name);
//        }
        System.out.println("testSet(hashSet);");
        testSet(hashSet);
        System.out.println("testSet(linkedHashSet);");
        testSet(linkedHashSet);
        System.out.println("testSet(treeSet);");
        testSet(treeSet);


        // проверим  ест ли элемент в множестве
        System.out.println(hashSet.contains("Bob5"));
        System.out.println(hashSet.contains("Bob"));

    }

    public static void testSet(Set<String> set) {
        set.add("BobBob");
        set.add("Bob2");
        set.add("Bob2zzz");
        set.add("Bob4");
        set.add("Bob5");
        set.add("Bob6");
        set.add("Bob7");
        set.add("Bob1");
        set.add("ZBob7");
        set.add("Zzzzzzzzzzz");
        set.add("Zzzzzzzzzzz");
        set.add("Zzzzzzzzzzz");
        set.add("Zzzzzzzzzzz");


        for (String name : set) {
            System.out.println(name);
        }

        System.out.println(set);


    }
}


