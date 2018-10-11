package Lessons_3x.Lesson_38_Exeption_2_Generate_Exception;

import java.util.Scanner;

public class ScannerException extends Throwable {
    public ScannerException(String description) {
        super(description);
    }
}
