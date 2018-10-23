package Lessons_4x.Lesson_43_no_inner_for_Stepan;

import java.util.ArrayList;

public class Animal43 {
    String name;
    ArrayList<Animal43> children;
    Boolean illness;

    Animal43(String name, boolean illness) {
        this.name = name;
        this.illness = illness;
        children = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChildren(ArrayList<Animal43> children) {
        this.children = children;
    }

    public void setIllness(Boolean illness) {
        this.illness = illness;
    }

    public ArrayList<Animal43> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Animal43{" +
                "name='" + name + '\'' +
                ", children=" + children +
                ", illness=" + illness +
                '}';
    }
}
