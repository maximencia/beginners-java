package Lessons_5x.Lesson_56_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1," Один ");
        map.put(2," Два ");
        map.put(3," Три ");
        System.out.println(map);
        System.out.println(map.size());
//        {1= Один , 2= Два , 3= Три }
//        3

        map.put(3," Три Три ");
        System.out.println(map);
        System.out.println(map.size());


//        {1= Один , 2= Два , 3= Три }
//        3
//        {1= Один , 2= Два , 3= Три Три }
//        3
        map.get(1);
        System.out.println(map.get(1));     // получаем значение по ключу
        System.out.println(map.get(10));     // получаем значение по ключу


        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // порядок элементов не сохраняется
        // порядок обеспечивается в 2 других классах см Linked Hash Map и ThreeMap

    }
}
