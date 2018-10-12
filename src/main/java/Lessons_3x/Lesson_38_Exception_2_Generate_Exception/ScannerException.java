package Lessons_3x.Lesson_38_Exception_2_Generate_Exception;

public class ScannerException extends Throwable {
    public ScannerException(String description) {
        super(description);
    }
}
