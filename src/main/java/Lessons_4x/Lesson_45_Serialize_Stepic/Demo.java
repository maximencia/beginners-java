package Lessons_4x.Lesson_45_Serialize_Stepic;




    public class Demo {

        public Demo() {
            System.out.println("Hi!");
        }

        public static void main(String[] args) throws Exception {
            Class clazz = Class.forName("Lessons_4x.Lesson_45_Serialize_Stepic.Demo");
            Demo demo = (Demo) clazz.newInstance();
        }
    }

