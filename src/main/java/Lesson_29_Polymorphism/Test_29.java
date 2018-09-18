package Lesson_29_Polymorphism;

/**
 * Created by Maxim.Rumyantsev on 18-Sep-18.
 */
public class Test_29 {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.eat();
        dog.bark();
        Animal animal1= new Dog();
        animal1.eat(); // - будет вызвана реализация в потомке
        //animal1.bark();   - не работает

        // Dog dog2 = new Animal(); - не работает

        Animal animal3=new Animal();
        Dog dog3 = new Dog();
        Cat cat = new Cat();
        System.out.println("---------------------");
        test(animal3);
        test(dog3);
        test(cat);

    }
public static void test(Animal animal){
    animal.eat();
    }

}