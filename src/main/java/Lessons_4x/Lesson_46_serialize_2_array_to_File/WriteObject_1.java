package Lessons_4x.Lesson_46_serialize_2_array_to_File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObject_1 implements Serializable // разрешаем джаве сериализовывать наши объекты
{
    public static void main(String[] args) {
        // запишем массив в файл
        Person46_1 [] people_crowd = {
                new Person46_1(1,"Bob"),
                new Person46_1(2,"Mike"),
                new Person46_1(3,"Jack"),
                new Person46_1(4,"Anna"),
                new Person46_1(5,"Kattie")};
        try {
            FileOutputStream fos = new FileOutputStream("people_crowd_2.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //..запишем объект типа массив
            oos.writeObject(people_crowd);

            oos.close(); // закрывем выходной поток данных
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
