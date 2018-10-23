package Lesson_xx.InputStreamStepic;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;

class Main {
    //Stepik code: start
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        //String result = IOUtils.toString(inputStream, "ASCII");

        //Первый  вариант
        //String result = IOUtils.toString(inputStream, charset);

        //Второй вариант
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(inputStream, charset);
        for (; ; ) {   //Бесконечный цикл если в теле цикла не написано условие выхода.
            int rsz = in.read(buffer, 0, buffer.length);
            if (rsz < 0)
                break;
            out.append(buffer, 0, rsz);
        }
        return out.toString();
    }
//Stepik code: end
}

//
//    Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку,
//        используя заданную кодировку.
//
//        Пример
//
//        InputStream последовательно возвращает четыре байта: 48 49 50 51.
//
//        Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".