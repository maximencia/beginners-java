package Lesson_34_WILDCARD_Generic;

public class Animal34 {
    private int id;

    public Animal34() {
    }

    public Animal34(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal34{" +
                "id=" + id +
                '}';
    }

    public void eat(){
        System.out.println("Animal eat");
    }
}
