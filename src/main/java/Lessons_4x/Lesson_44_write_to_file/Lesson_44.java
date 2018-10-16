package Lessons_4x.Lesson_44_write_to_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson_44 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("123.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test row 1 ");
        pw.println("Test row 2 ");

        pw.close();
    }
}
