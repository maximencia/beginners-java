package Lessons_4x.Lesson_41_Abstract_class;

public interface ableToMakeSound {
    public void makeSound();
    public void makeSound2();
    public void makeSound3();
    //public void makeSound4(); нужно реализовать все интерфейсы
    //Error:(3, 8) java: Lessons_4x.Lesson_41_Abstract_class.Dog2 is not abstract and does not override abstract method makeSound4() in Lessons_4x.Lesson_41_Abstract_class.ableToMakeSound
}
