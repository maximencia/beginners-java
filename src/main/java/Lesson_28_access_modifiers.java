import Lesson_28_access_modifiers.Person_28;

public class Lesson_28_access_modifiers  extends  Person_28{


    public Lesson_28_access_modifiers() {
        name_protected="Bob1";

    }

    public static void main(String[] args) {
        Person_28 person1 = new Person_28();
        person1.name28="28 lesson";
        //person1.name28_1="28 lesson"; error
        System.out.println(Person_28.CONSTANT);
      //  System.out.println(person1.name_protected); // не работает
        Lesson_28_access_modifiers pers2 = new Lesson_28_access_modifiers();
        System.out.println(pers2.name_protected);

    }
}
