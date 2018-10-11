package Lessons_3x.Lesson_38_Exeption_2_Generate_Exception;

import java.io.IOException;
import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println(" Пользователь ввел что - то кроме нуля. ");
                }

            }
        }
    }

}
