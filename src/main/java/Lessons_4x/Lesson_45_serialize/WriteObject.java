package Lessons_4x.Lesson_45_serialize;

import Lessons_2x.Lesson_26_Interfaces.Interfaces.Person;

import java.io.*;

public class WriteObject implements Serializable // разрешаем джаве сериализовывать наши объекты
{
    public static void main(String[] args) {
        // запишем 2 объекта в файл
        Person45 pers1= new Person45(1,"Bob");
        Person45 pers2= new Person45(2,"Mike");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pers1);
            oos.writeObject(pers2);

            oos.close(); // закрывем выходной поток данных
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
