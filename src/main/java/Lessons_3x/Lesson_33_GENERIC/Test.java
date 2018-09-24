package Lessons_3x.Lesson_33_GENERIC;

import Lessons_2x.Lesson_29_Polymorphism.Animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        /// Java 5
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();

        animals.add("Dog1");
        animals.add("Dog2");
        animals.add("Dog3");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);   // должны делать downcasting
       // String animal = (String) animals.get(3);   // должны делать downcasting   Exception in thread "main" java.lang.ClassCastException: Lessons_2x.Lesson_29_Polymorphism.Animal cannot be cast to java.lang.String
        System.out.println(animal);



        /// С появлением дженериков
        List<String> animals5 = new ArrayList<String>();


        animals5.add("Dog1");
        animals5.add("Dog2");
        animals5.add("Dog3");

        String animal5 = animals5.get(1);   // должны делать downcasting
        System.out.println(animal);



        /// Java 7
        List<String> animals7 = new ArrayList();  // параметризуем класс указывая только слева


        animals7.add("Dog1");
        animals7.add("Dog2");
        animals7.add("Dog3");
        //animals7.add(ourAnimal);  Error:(47, 17) java: no suitable method found for add(Lessons_2x.Lesson_29_Polymorphism.Animal)
        //method java.util.Collection.add(java.lang.String) is not applicable
        //        (argument mismatch; Lessons_2x.Lesson_29_Polymorphism.Animal cannot be converted to java.lang.String)


        String animal7 = animals7.get(1);   // должны делать downcasting
        System.out.println(animal);

    }
}
