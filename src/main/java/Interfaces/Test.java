package Interfaces;
// https://youtu.be/uCgF5-yCbGA?list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak

public class Test {
    public static void main(String[] args) {
        Animal animalOne = new Animal(12);
        Person personOne = new Person( "Rex");
        animalOne.sleep();
        personOne.sayHello();
        animalOne.showInfo();
        personOne.showInfo();

        Info info1 = new Animal(1);
        Info info2 = new Person("REX 2");

        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);

        Animal animalTwo = new Animal(12);
        Person personTwo = new Person( "Rex");
        outputInfo(animalOne);
        outputInfo(personTwo);

    }

    public static void outputInfo(Info info) {
    info.showInfo();
    }
}
