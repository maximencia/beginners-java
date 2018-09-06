public class Lesson_20_Constructor {

 public static void main(String[] args) {
            Human_1 numan0 = new Human_1();
            numan0.get_human_info();
            Human_1 numan1 = new Human_1();
            numan1.setAge(12);
            numan1.setName("vasilii");
            numan1.get_human_info();
            Human_1 numan2 = new Human_1("BOB");
            numan2.setAge(22);
            numan2.get_human_info();
            Human_1 numan3 = new Human_1("VASYA" , 33);
            numan3.get_human_info();
        }

    }

    class Human_1{

        public Human_1(){
            System.out.println("значения  по умолчанию ");
            this.name="dafault name";
            this.age=1;

        }
//        public Human_1(){
//            System.out.println("Привет из конструктора # 1 по умолчанию ");
//        }
        public Human_1(String name){
            this.name = name;
            System.out.println("Привет из конструктора # 2");
        }
        public Human_1(String name, int age){
            this.name = name;
            this.age = age;

            System.out.println("Привет из конструктора # 3");
        }


        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void get_human_info(){
            System.out.println(name+","+age);
        }
    }