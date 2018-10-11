package Lessons_3x.Lesson_37_Exception_1;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_1 {
//    public static void main(String[] args) {
//        File file= new File("123");
//        try {
//            Scanner scanner = new Scanner(file);
//            }
//        catch(FileNotFoundException e)
//            {
//            System.out.println("Файл не найден");
//            e.printStackTrace();
//            }
//        System.out.println(" После блока try catch  ");
//        }
//    }

    // throws FileNotFoundException {
//    "C:\Program Files\Java\jdk1.8.0_152\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.2.2\lib\idea_rt.jar=50677:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_152\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\rt.jar;C:\1\001_GIT\beginners-java\target\classes;C:\Users\maxim.rumyantsev\.m2\repository\com\vaadin\external\google\android-json\0.0.20131108.vaadin1\android-json-0.0.20131108.vaadin1.jar;C:\Users\maxim.rumyantsev\.m2\repository\commons-io\commons-io\2.6\commons-io-2.6.jar" Lessons_3x.Lesson_37_Exception_1.Exception_1
//            Exception in thread "main" java.io.FileNotFoundException: 123 (The system cannot find the file specified)
//            at java.io.FileInputStream.open0(Native Method)
//            at java.io.FileInputStream.open(FileInputStream.java:195)
//        at java.io.FileInputStream.<init>(FileInputStream.java:138)
//        at java.util.Scanner.<init>(Scanner.java:611)
//        at Lessons_3x.Lesson_37_Exception_1.Exception_1.main(Exception_1.java:10)


    public static void main(String[] args) {
    try {
    readFile();
    }
    catch (FileNotFoundException e){
        System.out.println(" Обработка исключения в методе майн");
    }
    }
public static void  readFile() throws FileNotFoundException{
        File file1=new File("test");
        Scanner scanner = new Scanner(file1);
    }
}
