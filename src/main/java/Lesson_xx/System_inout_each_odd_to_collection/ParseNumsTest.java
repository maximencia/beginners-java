package Lesson_xx.System_inout_each_odd_to_collection;

import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by vitaly on 02/10/16.
 *
 * In order to have your JUnit test working, add this Java Class file into your package,
 * then add JUnit 4 jar to the project's classpath:
 *   1. File -> Project Structure -> Modules -> Dependencies
 *   2. Click + (Add) -> JARs or directories
 *   3. Add IntelliJ dir/Contents/lib -> junit 4
 *   4. (Optionally for OS X) Add IntelliJ dir/Contents/lib -> hamcrest-core
 */

public class ParseNumsTest {
    @org.junit.Test
    public void parse1() throws Exception {
        String input = "1 2 3 4 5 6 7 8";
        String expected = "8 6 4 2 ";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(Main.CHARSET));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // create custom output stream
        PrintStream customStream = new PrintStream(outputStream);

        // execute code
        Main.parseNums_odd_to_collect(inputStream, customStream, Main.CHARSET);

        System.out.printf("%-20s %-30s\n", "Test", new Exception("not thrown").getStackTrace()[0].getMethodName());
        System.out.printf("%-20s %-30s\n", "Input", input);
        System.out.printf("%-20s %-30s\n", "Expected output", expected);
        System.out.printf("%-20s %-30s\n", "Actual output", outputStream);
        System.out.println();

        // compare an expected output to the actual output
        Assert.assertEquals(expected, outputStream.toString());
    }


}