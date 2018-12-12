package Lessons_6x.Lesson_61_HashMap_how_it_works;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Maxim.Rumyantsev on 21.11.2018.
 */
public class test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Bob",25);
        map.put("Katy",15);
        map.put("Duke",45);

        Set<String> set = new HashSet<>();


    }

    //получается что если у хешсета сделать так
    //что hash для каждого элемента возвращает 1 то хешсет превращается в linkedlist


}
