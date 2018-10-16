package Lessons_4x.Lesson_47_serialaze_3_Transient_serialVersionUID;

import Lessons_4x.Lesson_45_serialize.Person45;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people47.bin"))) {
            Person47 person3 = (Person47) ois.readObject();
            System.out.println(person3);
        }
        catch (IOException e)               {e.printStackTrace();}
        catch (ClassNotFoundException e)    {e.printStackTrace();}

    }
}
