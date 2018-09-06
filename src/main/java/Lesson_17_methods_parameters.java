public class Lesson_17_methods_parameters {
//https://www.youtube.com/watch?v=J8ZLRvOO6vk&index=17&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak
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
        person1.setName("Рома!");
        person1.speak();
        String ss3="Вовка";
        person2.setName(ss3);
        person2.speak();
        person1.setNameAndAge("Света!",13);
        person1.speak();
        ss3="Костя";
        person2.setNameAndAge(ss3,1);
        person2.speak();
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

    void setName(String username)
    {name = username;
    }
    void setNameAndAge(String username, int ageFromArg)
    {name = username;
     age = ageFromArg;
    }


}
