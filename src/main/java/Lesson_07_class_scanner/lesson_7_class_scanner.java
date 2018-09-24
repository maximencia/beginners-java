package Lesson_07_class_scanner;

import java.util.Scanner;

/**
 * Created by Maxim.Rumyantsev on 29-Aug-18.
 */
public class lesson_7_class_scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input something");
        String string = s.nextLine();
        System.out.println(string);
        System.out.println(s);

    }

}
