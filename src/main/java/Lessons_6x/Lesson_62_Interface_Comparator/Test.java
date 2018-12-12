package Lessons_6x.Lesson_62_Interface_Comparator;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();

        animal.add("b");
        animal.add("bb");
        animal.add("aa");
        animal.add("cat");
        animal.add("dog");
        animal.add("bird");
        animal.add("frog");

//        System.out.println(animal);
//        Collections.sort(animal);
//        System.out.println(animal);


        Collections.sort(animal, new StringLengthComparator());
        System.out.println(animal);


        System.out.println();


        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(150);

        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, new BackwardsIntegerComparator());
        System.out.println(numbers);

        //если мы хотим реализовать свою логику сортировки объектов


        //или же так!
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);



        List<Person> people  = new ArrayList<>();
        people.add(new Person(1,"Bob"));
        people.add(new Person(5,"Bob1"));
        people.add(new Person(4,"Bob2"));
        people.add(new Person(3,"Bob3"));
        people.add(new Person(2,"Bob4"));

        Collections.sort(people,
                new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
            });

        System.out.println(people);

        }



}

class StringLengthComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
            /*
            01 > 02 = 1
            01 < 02 = -1
            01 == 02 = 0

            compare(2,1) =1
            compare(1,2) =-1
            compare(1,1) =0

             */
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }

    }
}

class Person {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}