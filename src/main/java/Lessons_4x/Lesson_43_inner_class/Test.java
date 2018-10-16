package Lessons_4x.Lesson_43_inner_class;

public class Test {
    public static void main(String[] args) {
        Electrocar ecar = new Electrocar(1);
        ecar.start();

        Electrocar.Battery battery= new Electrocar.Battery();
        battery.charge();



    }
}
