package Lessons_4x.Lesson_45_serialize;

import Lessons_2x.Lesson_26_Interfaces.Interfaces.Person;
import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person45 person3 = (Person45) ois.readObject();
            Person45 person4 = (Person45) ois.readObject();

            System.out.println(person3);
            System.out.println(person4);

            ois.close();

        }
        catch (IOException e)               {e.printStackTrace();}
        catch (ClassNotFoundException e)    {e.printStackTrace();}

    }
}
