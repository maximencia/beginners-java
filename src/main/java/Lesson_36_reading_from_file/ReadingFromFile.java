package Lesson_36_reading_from_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:"+separator+"1"+separator+"001_GIT"+separator+"beginners-java"+separator+"test.csv";
        System.out.println(path);
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        Scanner scanner2 = new Scanner(file);
        String line = scanner2.nextLine();
        String[] words = line.split("0 ");  //  разделим сторку на массив - сепаратор = 0
        System.out.println(words.toString());
        System.out.println(Arrays.toString(words));

        scanner2.close();

//        Scanner scanner3 = new Scanner(file);
//        String line2 = scanner3.nextLine();
//        String[] words2 = line2.split("0 ");  //  разделим сторку на массив - сепаратор = 0
//        System.out.println(words2.toString());
//        System.out.println(Arrays.toString(words));
//
//        scanner3.close();








    }
}
