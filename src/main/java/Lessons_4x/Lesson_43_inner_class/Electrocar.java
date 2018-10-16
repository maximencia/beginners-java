package Lessons_4x.Lesson_43_inner_class;

public class Electrocar {
    private int id;

    //inner class#1  вложенный нестатический класс
    private class Motor {
        public void startMotor()
        {
            System.out.println("Motor  " + id + "  is starting...");
        }
    }
    //inner class#2   статический вложенный класс
    public static class Battery {
        public void charge () {
            System.out.println("Battery is charging...");
        }
    }



    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Ecar  " + id + "  is starting...");

        final int x=1;
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }

        }

       SomeClass someObject = new SomeClass();
       test_777(someObject);
    }

    private void test_777(Object o){

    }
}

