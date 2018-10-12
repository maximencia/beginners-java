package Lessons_3x.Lesson_40_Exception;

import sun.security.pkcs.ParsingException;

import java.io.IOException;
import java.text.ParseException;

public class Exception_4 {
    public static void main(String[] args) {
        try    { run(); }
        catch (IOException e)    {e.printStackTrace();  }
        catch (ParseException e1) { e1.printStackTrace(); }

        //для java 7
        try    { run(); }
        catch (IOException |ParseException e)
        { e.printStackTrace(); }

        //наследование исключений

        //для java 7
        try    { run(); }
        catch (Exception e)  { e.printStackTrace(); }
       // catch (ParseException p) {} {Error:(25, 9) java: exception java.text.ParseException has already been caught


    }





    public static void run() throws IOException,ParseException , IllegalArgumentException
    {
    }
}
