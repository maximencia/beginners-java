package Lessons_2x.Lesson_21_StaticWord;

public class Lesson_21_StaticWord {
    public static void main(String[] args) {
        Human_2.gettDescription();
        Human_2.description= "nICE";
        Human_2.gettDescription();
        Human_2 h1 = new Human_2("Bob",30);
        h1.getAllField();
        Human_2 h2 = new Human_2("Todd",65);
        h2.getAllField();
        Human_2.description= "Bad";
        h1.getAllField();
        h2.getAllField();
        System.out.println(Math.pow(2,4));
        System.out.println(Human_2.PI);
        Human_2 h3 = new Human_2("Todd2",65);
        h3.getAllField();

    }
}
class Human_2{
    private String name;
    private int age;
    public static String description = "123";
    public static final double PI=3.1444444;
    public static int countPeople;

    public static void gettDescription() {
        System.out.println(description);
    }
    public void getAllField() {
        System.out.println( "Lessons_2x.Lesson_21_StaticWord.Human_2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description=" + description +
                ", CountPeople=" + countPeople +
                '}');
    }
    public Human_2(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
        System.out.println("Привет из конструктора # 3");
    }
}

