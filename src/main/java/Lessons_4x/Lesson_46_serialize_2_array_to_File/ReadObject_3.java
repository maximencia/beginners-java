package Lessons_4x.Lesson_46_serialize_2_array_to_File;

import Lessons_2x.Lesson_26_Interfaces.Interfaces.Person;
import Lessons_4x.Lesson_45_serialize.Person45;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people_crowd_2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person46_1[] people_crowd= (Person46_1[]) ois.readObject();

            System.out.println(Arrays.toString(people_crowd));

            ois.close();

        }
        catch (IOException e)               {e.printStackTrace();}
        catch (ClassNotFoundException e)    {e.printStackTrace();}

    }
}
