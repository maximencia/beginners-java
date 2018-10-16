package Lessons_4x.Lesson_41_Abstract_class;

public abstract class Animal {
    int weight;
    public void eat()
    {
        System.out.println("Animal is eating...");
    }

    public abstract void makeSound();
}
