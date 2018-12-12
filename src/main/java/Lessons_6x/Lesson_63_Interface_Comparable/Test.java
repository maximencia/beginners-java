package Lessons_6x.Lesson_63_Interface_Comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();
        addElements(peopleList);
        addElements(peopleSet);
        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

 private static void addElements(Collection collection) {
        collection.add(new Person(1,"Bob"));
        collection.add(new Person(2,"Tom"));
        collection.add(new Person(3,"Tommy"));
        collection.add(new Person(4,"George"));
 }
}

class Person {
    private int id;
    private  String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
//    Exception in thread "main" java.lang.ClassCastException: Lessons_6x.Lesson_63_Interface_Comparable.Person cannot be cast to java.lang.Comparable
//        at java.util.TreeMap.compare(TreeMap.java:1294)
//        at java.util.TreeMap.put(TreeMap.java:538)
//        at java.util.TreeSet.add(TreeSet.java:255)
//        at Lessons_6x.Lesson_63_Interface_Comparable.Test.addElements(Test.java:17)
//        at Lessons_6x.Lesson_63_Interface_Comparable.Test.main(Test.java:10)