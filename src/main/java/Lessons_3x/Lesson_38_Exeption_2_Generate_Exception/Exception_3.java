package Lessons_3x.Lesson_38_Exeption_2_Generate_Exception;

import java.util.Scanner;

public class Exception_3 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            int x = Integer.parseInt(scanner.nextLine());
            if(x!=0){
                throw new ScannerException("нельзя вводить не ноль!");
            }
        }

    }
}
