package Lessons_3x.Lesson_39_Exception_3_Checked_Unchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_3 {
    public static void main(String[] args) {

        //checked Exception (Compile Time Exception) = исключительные случаи в работе программы

        //unchecked (Runtime Exception)

        //checked Exception (Compile Time Exception)
        File file = new File("123");
        try {
            Scanner scanner = new Scanner(file);
        }
        catch(
            FileNotFoundException e){
            System.out.println(" File not found");
        }


        //Unchecked exception (Runtime Exception)
        //int a = 1/0;
        String name =null;
        name.substring(1,2);

        int[] arr = new int[2];
        System.out.println(arr[10]);

        //такие ошибки не нужно обрабатывать их нельзя допускать.



    }
}
