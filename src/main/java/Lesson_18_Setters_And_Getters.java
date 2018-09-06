public class Lesson_18_Setters_And_Getters {
    public static void main(String[] args) {
        Person_1 person1 = new Person_1();
        //person1.name = "Вася";
        //person1.age =
        person1.setName("");
        System.out.println(person1.getAge()+"  "+person1.getName());
        person1.setName("Какоето имя");
        person1.setAge(12);
        System.out.println(person1.getAge()+"  "+person1.getName());
    }
}
class Person_1{
    private String name;
    private int age;

    public void setName(String name___1) {
        if (name___1.isEmpty()){
            System.out.println(" name pustoe!"); }
        else {
        name = name___1;}
    }
    public void setAge(int age___1) {
        age = age___1;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

