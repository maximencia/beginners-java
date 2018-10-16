package Lessons_4x.Lesson_41_Abstract_class;



public class Lesson_41_Abstract_class {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Dog2 dog2 = new Dog2();

        // Animal animal = new  Animal();  Error:(9, 25) java: Lessons_4x.Lesson_41_Abstract_class.Animal is abstract; cannot be instantiated
        //ОТ анимал можно наследоваться но нельзя создавать его экземпляры/
        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
        dog2.makeSound();
        dog2 .makeSound2();
        dog2.makeSound3();
        dog.weight=20;



    }
}
