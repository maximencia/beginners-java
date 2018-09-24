package Lesson_26_Interfaces.Interfaces;


public class Person  implements Info {

    public String name;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello()
    {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("showInfo from Person class - Hello");
    }
}
