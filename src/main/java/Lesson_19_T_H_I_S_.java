public class Lesson_19_T_H_I_S_ {
    //https://www.youtube.com/watch?v=sPPaDe_5fcQ&index=19&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak
    public static void main(String[] args) {
        Human numan1 = new Human();
        numan1.setAge(12);
        numan1.setName("vasilii");
        numan1.get_human_info();
    }

}
class Human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String the_name__nazovi_kak_ugodno) {
        this.name = the_name__nazovi_kak_ugodno;
    }
    // no так мы используем  лишнюю переменную хотя моглибы использовать только name и написать так
    // public void setName(String name) {
    //    this.name = name;
    //}



    public void setAge(int age) {
        this.age = age;
    }

    public void get_human_info(){
        System.out.println(name+","+age);
    }
}