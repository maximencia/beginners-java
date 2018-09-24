package Lesson_26_inheritance;

public class lesson_26_inheritance {
    // https://youtu.be/28NP_V2yc60?list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak
    public static void main(String[] args) {
       Animal_26 animal =  new Animal_26();
       animal.eat();
       animal.sleep();
       Dog dog = new Dog();
       dog.name="Rex";
       dog.eat();
       dog.sleep();
       dog.bark();
       dog.showName();

    }
}
