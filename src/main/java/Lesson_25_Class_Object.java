public class Lesson_25_Class_Object {
    public static void main(String[] args) {
      Human_3 h1 = new Human_3("Max",37);
        System.out.println(h1);

       // Привет из конструктора # 3
       // Human_2@1540e19d

        System.out.println(h1.toString());
        // Human_2@1540e19d

        System.out.println(h1.toString1());
        // Human_2@1540e19d


    }
}
class Human_3{
    private String name;
    private int age;
    public static String description = "123";
    public static final double PI=3.1444444;
    public static int countPeople;

    public static void gettDescription() {
        System.out.println(description);
    }
    public void getAllField() {
        System.out.println( "Human_2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description=" + description +
                ", CountPeople=" + countPeople +
                '}');
    }
    public Human_3(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
        System.out.println("Привет из конструктора # 3");
    }

    public String toString1() {
        return "Human_3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
