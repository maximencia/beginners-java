package Lessons_4x.Lesson_42_equals;



public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();

        System.out.println(animal ==animal2);
        //false
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal(1);

        System.out.println(animal3 ==animal4);
        //false
        // мы сравниваем указатели а они конечно же не равны хотя по сушьности они одинаковы.

        //мы хотим сравнить объекты структурно.

        System.out.println(animal.equals(animal2));
        System.out.println(animal3.equals(animal4));

        //переопределим метод иквалс :)

        System.out.println(animal.our_equals(animal2));
        System.out.println(animal3.our_equals(animal4));

         //вот теперь тру тру

        Animal anima5 = new Animal();
        Animal animal6 = anima5;

        System.out.println(anima5 ==animal6);
        // true

        //сравнение строк

        String string1="Hello";  // String pool   --      string1    -->   {"Hello"}
        String string2="Hello";  // вместо содание такогоже объекта джава просто ссылается на похожий объект
                                 // как будто происходит кеширование
        System.out.println(string1==string2);
        // true

        String string3 = new String("Hello");
        String string4 = new String("Hello");
        System.out.println(string3==string4);
        //false   тут уже кеширование не работает

        String a ="Hello";
        String b  ="Hello123".substring(0,5);
        String b1 ="HellO123".substring(0,5);
        System.out.println(b);
        System.out.println(a==b);
        // false
        // всегда сравнивайте строки с помощью equaд
        System.out.println(a.equals(b));
        //true
        System.out.println(a.equals(b1));
        //false
    }
}
