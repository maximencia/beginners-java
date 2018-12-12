package Lessons_6x.Lesson_63_Interface_Comparable;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Person2> peopleList = new ArrayList<>();
        Set<Person2> peopleSet = new TreeSet<>();
        addElements(peopleList);
        addElements(peopleSet);
        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

 private static void addElements(Collection collection) {
        collection.add(new Person2(1,"Bob11111"));
        collection.add(new Person2(4,"Tom222222222"));
        collection.add(new Person2(3,"Tommy33333333333"));
        collection.add(new Person2(2,"George44444444444444"));
 }
}

class Person2 implements Comparable<Person2>{
    private int id;
    private  String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person2)) return false;

        Person2 person2 = (Person2) o;

        if (id != person2.id) return false;
        return name != null ? name.equals(person2.name) : person2.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public int compareTo(Person2 o) {
//        if (this.id >o.getId()) {
//            return 1;
//        }
//        else if (this.id <o.getId()){
//            return -1;
//        }
//        else {
//            return 0;
//        }
//        }
//

    // отсортируем по длине имени.
        @Override
    public int compareTo(Person2 o) {
        if (this.name.length() >o.getName().length()) {
            return 1;
        }
        else if (this.name.length() <o.getName().length()){
            return -1;
        }
        else {
            return 0;
        }
        }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
