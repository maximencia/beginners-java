package Lessons_5x.Lesson_57_LinkedHashMap_and_ThreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Maxim.Rumyantsev on 13.11.2018.
 */
public class test {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap= new HashMap<>();
        // внутри не гарантируется никакого порядка

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        // в каком порядке пары были добавлены
        // в таком они и вернутся

        Map<Integer,String> treeMap = new TreeMap<>();
        // пары (ключб значение) сортируются по ключу (естественный порядок)

        System.out.println("testMap(hashMap);");
    testMap(hashMap);
        System.out.println("testMap(linkedHashMap);");
    testMap(linkedHashMap);
        System.out.println("testMap(treeMap);");
    testMap(treeMap);


    }

    public static void testMap(Map<Integer,String> map){
        map.put(10,"Bob");
        map.put(11,"Bob2");
        map.put(14,"Bob3");
        map.put(111,"Bob4");
        map.put(112,"Bob5");
        map.put(0,"Bob6");
        map.put(1,"Bob7");


        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }

}
