package Lessons_4x.Lesson_41_Abstract_class;

public class Dog2 implements ableToMakeSound{

    @Override
    public void makeSound() {
        System.out.println("Gav gav ....RRRRRRRR....");

    }

    //Error:(3, 8) java: Lessons_4x.Lesson_41_Abstract_class.Dog2 is not abstract and does not override abstract method makeSound2() in Lessons_4x.Lesson_41_Abstract_class.ableToMakeSound
    @Override
    public void makeSound2() {

    }

    @Override
    public void makeSound3() {

    }
}

