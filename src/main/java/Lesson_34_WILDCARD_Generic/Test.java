package Lesson_34_WILDCARD_Generic;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<Animal34> ListOfAnimal = new ArrayList<>(); //  Set  language level to 7
        Animal34 a = new Animal34(1);
        ListOfAnimal.add(a);

        ListOfAnimal.add(new Animal34(2));

        test(ListOfAnimal);

        List<Dog> ListofDog= new ArrayList<>();
        ListofDog.add(new Dog());
        ListofDog.add(new Dog());

        //test(ListofDog); //  Error:(21, 14) java: incompatible types: java.util.List<Lesson_34_WILDCARD_Generic.Lesson_26_inheritance.Dog> cannot be converted to
        // java.util.List<Lesson_34_WILDCARD_Generic.Animal34>
        test2(ListofDog);



    }
    private static void  test(List<Animal34> list){
        for(Animal34 animal:list){
            System.out.println(animal);
        }

        /*
    object
    animal +
    dog    +

    */

    }                         // List<? extends Animal34> list - мы можем поставить элементы либо анимал либо наследников от анимал
    private static void  test2(List<? extends Animal34> list){
        for(Animal34 animal:list){
            System.out.println(animal);
        }
    }

    /*
object  +
animal +
dog    +

*/
//    private static void  test3(List<? super Animal34> list){
//        for(Animal34 animal:list){
//            System.out.println(animal);
//        }
//    }
}
