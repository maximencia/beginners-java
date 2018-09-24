package Lessons_3x.Lesson_35_anonymous_classes;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat(); //1
        OtherAnimal oa = new OtherAnimal();
        oa.eat(); //2
        Animal a2 = new Animal();
        a.eat();  //3

        // если нужно использовать один раз
        // содадим объект с переопределенным методом ит
        Animal a3 = new Animal(){
            @Override
            public void eat() {
                //super.eat();
                System.out.println(" 3 other animal is eating ...");
            }
        };
        a3.eat(); //4

        Animal3 a4 = new Animal3();
        a4.eat(); //5

        Animal_I a5 = new Animal3();
        a5.eat(); //6

        Animal_I ai = new Animal_I() {
            @Override
            public void eat() {
                System.out.println("Eating 2 ");
            }
        };
        ai.eat(); //7
    }
}
