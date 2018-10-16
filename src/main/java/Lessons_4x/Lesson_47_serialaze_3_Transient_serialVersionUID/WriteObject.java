package Lessons_4x.Lesson_47_serialaze_3_Transient_serialVersionUID;

import Lessons_4x.Lesson_45_serialize.Person45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObject implements Serializable // разрешаем джаве сериализовывать наши объекты
{
    public static void main(String[] args) {
        // запишем 2 объекта в файл
        Person47 pers1= new Person47(1,"Bob47","Mamyantsev");
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people47.bin")))  {
            oos.writeObject(pers1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
