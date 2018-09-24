package Lesson_14_15_classes_and_object;



public class lesson14_15_classes_and_objects {
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
        int years1 = person1.calculateYearsToRetirement();
    }
}
    class Person {
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
