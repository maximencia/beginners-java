package Lesson_xx.System_In_Out_STEPIC;


        
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.util.Scanner;

import static java.nio.charset.Charset.forName;

class Main {

    public static final String CHARSET = "UTF-8";



    public static void main(String[] args) throws UnsupportedEncodingException {
        String input = "1\n2 3";
        //String input = "1 2 3 4 5 6";
        String expected = "6.000000";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(Main.CHARSET));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // create custom output stream
        PrintStream customStream = new PrintStream(outputStream);

        // execute code
        Main.parseNums(inputStream, customStream, Main.CHARSET);

//        System.out.printf("%-20s %-30s\n", "Test", new Exception("not thrown").getStackTrace()[0].getMethodName());
//        System.out.printf("%-20s %-30s\n", "Input", input);
//        System.out.printf("%-20s %-30s\n", "Expected output", expected);
//        System.out.printf("%-20s %-30s\n", "Actual output", outputStream);
//        System.out.println();
    }


    public static void parseNums(ByteArrayInputStream inputStream, PrintStream customStream, String charset) {

        Scanner scan = new Scanner(inputStream, charset);
        Double sum = Double.valueOf(0);
        Double i = Double.valueOf(0);

        while (scan.hasNext()) {
              //System.out.println(scan.next());
//                System.out.println(scan.nextInt());   // нельзя лишний раз писать scan.next() он же переключает!
//                sum =sum + scan.nextInt();
            try  {i= Double.parseDouble(scan.next());
            }
            catch (NumberFormatException e)
            {
               i=Double.valueOf(0);
            }

            sum =sum + i;
            }
            scan.close();
        String strDouble = String.format("%.6f", sum);


        customStream.print(strDouble);
       // System.out.println(new BigDecimal(3.675f).setScale(2, RoundingMode.FLOOR).floatValue());
        //customStream = "123";
       // return customStream;


    }
    public static void parseNums2(InputStream inputStream, OutputStream customStream, String charset) {

        Scanner scan = new Scanner(inputStream, charset);
        Double sum = Double.valueOf(0);
        Double i = Double.valueOf(0);

        while (scan.hasNext()) {

            try  {i= Double.parseDouble(scan.next());
            }
            catch (NumberFormatException e)
            {
                i=Double.valueOf(0);
            }

            sum =sum + i;
        }
        scan.close();
        String strDouble = String.format("%.6f", sum);
        byte[] b= strDouble.getBytes();

        try {
            customStream.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
//       Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных чисел с
//        точностью до шестого знака после запятой. Числом считается последовательность символов, отделенная от окружающего текста
//        пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.
//
//        На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей
//        системы), метод main, прописать все import'ы.

//    правильное решение вот такое :)
//
//        import java.util.InputMismatchException;
//        import java.util.Scanner;
//    public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double sum=0.0;
//        while (scanner.hasNext()) {
//            try {
//                sum +=scanner.nextDouble();
//            } catch (InputMismatchException e) {
//                scanner.next();
//            }
//        }
//        System.out.printf("%.6f", sum);
//    }
//}