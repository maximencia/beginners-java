package Lessons_2x.Lesson_22_FINAL;

public class Lesson_22_FINAL {
    public static void main(String[] args) {
        final int  X=10;
        //X=5; Error:(4, 9) java: cannot assign a value to final variable X

    }
}

class Test {
    public static final  int CONSTANT_1=1;

    // если мы делаем константу - статик что очень логично и экономит память , то мы должны ее инициализировать через имя класса а не через конструктор
//    public  Lessons_2x.Lesson_22_FINAL.Test (int CONSTANT_1){
//        this.CONSTANT_1 = CONSTANT_1;
//    }
}
