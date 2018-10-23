package Lessons_4x.Lesson_42_equals;

public class Animal {
    private int id;

    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }



    public boolean our_equals(Object o) {
        Animal otheranimal = (Animal) o;
        return id == otheranimal.id;
    }

}