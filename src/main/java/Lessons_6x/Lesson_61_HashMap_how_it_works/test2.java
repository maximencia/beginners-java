package Lessons_6x.Lesson_61_HashMap_how_it_works;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Maxim.Rumyantsev on 21.11.2018.
**/
public class test2{




//    Теперь методы hashCode() и equals() работают корректно и учитывают содержимое полей объекта:
//

    public static void main(String[] args) {

        BlackBox b1 = new BlackBox(1,2);
        BlackBox b2 = new BlackBox(1,2);

        HashSet<BlackBox> new_map = new HashSet<>();

        new_map.add(b1);
        new_map.add(b2);

        System.out.println(new_map);



       // object1.equals(object2);//true
       // object1.hashCode() == object2.hashCode();//true
    }

}
