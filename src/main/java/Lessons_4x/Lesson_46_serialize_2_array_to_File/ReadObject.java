package Lessons_4x.Lesson_46_serialize_2_array_to_File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people_crowd.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int crowd_lenght = ois.readInt();
            Person46 [] people_crowd = new Person46[crowd_lenght];

            for (int i=0 ; i<crowd_lenght; i++)
            {
             people_crowd[i]=(Person46) ois.readObject();
            }

            System.out.println(crowd_lenght);
            System.out.println(Arrays.toString(people_crowd));

            ois.close();

        }
        catch (IOException e)               {e.printStackTrace();}
        catch (ClassNotFoundException e)    {e.printStackTrace();}

    }
}
