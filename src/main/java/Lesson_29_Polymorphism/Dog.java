package Lesson_29_Polymorphism;

/**
 * Created by Maxim.Rumyantsev on 18-Sep-18.
 */
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dоg is eating"); }

    public void bark() {
        System.out.println("DOg is barking");
    }
}
