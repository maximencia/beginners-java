package Lessons_4x.Lesson_45_Serialize_Stepic;


import java.io.*;
import java.util.Objects;

//https://stepik.org/lesson/12785/step/8?unit=3132
class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static void Main(String[] args) throws IOException {
        Animal[] animal = new Animal[]{
                new Animal("Cat"),
                new Animal("Dog"),
                new Animal("Mouse")
        };


        byte[] data = MainTest.serialize(animal.length , animal);
        deserializeAnimalArray(data);

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try {
            ByteArrayInputStream byteStream = new ByteArrayInputStream(data);
            ObjectInputStream in = new ObjectInputStream(byteStream);

            int arrayLenght = in.readInt();
            System.out.println(" arrayLenght = " + arrayLenght);

            Animal[] animalFromData = new Animal[arrayLenght];
            for (int i = 0; i < arrayLenght; i++) {
                animalFromData[i] = (Animal) in.readObject();
            }
            return animalFromData;
        } catch (IOException e) {
            throw new IllegalArgumentException();
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException();
        } catch (ClassCastException e) {
            throw new IllegalArgumentException();
        } catch (java.lang.NegativeArraySizeException e) {
            throw new IllegalArgumentException();

        }


    }
}

//    Дан сериализуемый класс Animal:
//
//class Animal implements Serializable {
//    private final String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Animal) {
//            return Objects.equals(name, ((Animal) obj).name);
//        }
//        return false;
//    }
//}

//    Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal. Массив байт устроен следующим образом.
//        Сначала идет число типа int, записанное при помощи ObjectOutputStream.writeInt(size). Далее подряд записано указанное количество
//        объектов типа Animal, сериализованных при помощи ObjectOutputStream.writeObject(animal).
//
//        Если вдруг массив байт не является корректным представлением массива экземпляров Animal, то метод должен бросить исключение
//        java.lang.IllegalArgumentException.
//        Причины некорректности могут быть разные. Попробуйте подать на вход методу разные некорректные данные и посмотрите, какие
//        исключения будут возникать. Вот их-то и нужно превратить в IllegalArgumentException и выбросить. Если что-то забудете, то
//        проверяющая система подскажет. Главное не глотать никаких исключений, т.е. не оставлять нигде пустой catch.


