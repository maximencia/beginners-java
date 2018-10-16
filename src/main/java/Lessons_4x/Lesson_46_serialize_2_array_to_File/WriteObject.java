package Lessons_4x.Lesson_46_serialize_2_array_to_File;

import Lessons_2x.Lesson_26_Interfaces.Interfaces.Person;
import Lessons_4x.Lesson_45_serialize.Person45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObject implements Serializable // разрешаем джаве сериализовывать наши объекты
{
    public static void main(String[] args) {
        // запишем массив в файл
        Person46 [] people_crowd = {
                new Person46(1,"Bob"),
                new Person46(2,"Mike"),
                new Person46(3,"Jack")};
        try {
            FileOutputStream fos = new FileOutputStream("people_crowd.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println(people_crowd.length);
            oos.writeInt(people_crowd.length);
            for (Person46 persN: people_crowd)
            {
                oos.writeObject(persN);
            }
            oos.close(); // закрывем выходной поток данных
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
