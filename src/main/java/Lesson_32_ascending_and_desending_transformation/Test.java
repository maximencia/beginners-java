package Lesson_32_ascending_and_desending_transformation;

/**
 * Created by Maxim.Rumyantsev on 19-Sep-18.
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        dog.Eat();

        // Upcasting - восходящее преобразование
        Animal animal = new Dog();
        animal.Eat();
        //animal.Bark();   нет

        Animal animal2 = dog;
        animal2.Eat();
        //animal2.Bark();   нет


        // Downcasting - Нисходящее преобразование
        Dog dog2 = (Dog) animal2;
        dog2.Eat();
        dog2.Bark();

        // не всегда безопасно   -   Exception in thread "main" java.lang.ClassCastException:
        // Lesson_32_ascending_and_desending_transformation.Animal cannot be cast to Lesson_32_ascending_and_desending_transformation.Lesson_26_inheritance.Dog
        Animal a_err = new Animal();
        Dog dog_e = (Dog) a_err;
        dog.Bark();

    }
}
