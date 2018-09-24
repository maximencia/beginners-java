package Lesson_16_return_value_in_type;

public class Lesson_16_method_return_value_in_type {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Вася";
        person1.age = 11;
        Person person2 = new Person();
        person2.name = "Сева";
        person2.age = 11;
        System.out.println(person1.name + " и  " + person2.name);
        System.out.println(person1.age + person2.age);
        person1.sayHello();
        person1.speak();
        person2.speak();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println(person1.name + " до пенсии " + year1);
        System.out.println(person2.name + " до пенсии " + year2);

    }
}
  class Person{
        String name;
        int age;

        void speak() {
            System.out.println("Меня  зовут " + name + " мне лет так - " + age);
        }

        void sayHello() {
            System.out.println("Привет");
        }

        int calculateYearsToRetirement() {
            int years = 65 - age;
            return years;
        }
    }
