package Lessons_5x.Lesson_59_hashcode_equals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Maxim.Rumyantsev on 16.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();
        Set<String> setString = new HashSet<>();

        setString.add("Hello");
        setString.add("Hello");
        setString.add("Hello");
        System.out.println(setString); // Hello  = Hello


        Person person1 = new Person(1, "VIKE");
        Person person2 = new Person(1, "VIKE");
        Person person3 = new Person(1, "MIKE");

        map.put(person1, "Jlby");
        map.put(person2, "Jlby");
        map.put(person3, "Jlby");

        set.add(person1);
        set.add(person2);
        set.add(person3);

        System.out.println(map);
        System.out.println(set);


        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person2));

    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

//    @Override
//    public int hashCode() {
//        int a = super.hashCode();
//        System.out.println(a);
//        return a;
//    }


    @Override
    public int hashCode() {
        int a = super.hashCode();
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        System.out.println(result + " vs " + a);
        return result;
    }
}


//"C:\Program Files\Java\jdk1.8.0_152\bin\java" -Didea.launcher.port=7540 "-Didea.launcher.bin.path=C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2016.3.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_152\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\rt.jar;C:\1\001_GIT\beginners-java\target\classes;C:\Users\maxim.rumyantsev\.m2\repository\com\vaadin\external\google\android-json\0.0.20131108.vaadin1\android-json-0.0.20131108.vaadin1.jar;C:\Users\maxim.rumyantsev\.m2\repository\commons-io\commons-io\2.6\commons-io-2.6.jar;C:\Users\maxim.rumyantsev\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\maxim.rumyantsev\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2016.3.4\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain Lessons_5x.Lesson_59_hashcode_equals.Test
//        [Hello]
//        2634604 vs 856419764
//        2634604 vs 621009875
//        2366485 vs 1265094477
//        2634604 vs 856419764
//        2634604 vs 621009875
//        2366485 vs 1265094477

//при зарыти идеии и перезапуске получили

 //       [Hello]
 //        2634604 vs 621009875
//        2634604 vs 1265094477
//        2366485 vs 2125039532
//        2634604 vs 621009875
//        2634604 vs 1265094477
//        2366485 vs 2125039532
//        {Person{id=1, name='MIKE'}=Jlby, Person{id=1, name='VIKE'}=Jlby}
//        [Person{id=1, name='MIKE'}, Person{id=1, name='VIKE'}]
//        false
//        true


//    Теперь понято, почему Object.equals() работает не так как нужно, ведь он сравнивает ссылки, а не содержимое объектов.
//        Далее на очереди hashCode(), который тоже работает не так как полагается.
//
//        Заглянем в исходный код метода hashCode() в классе Object:
//public native int hashCode();
//
//        Вот собственно и вся реализация. Ключевое слово native означает, что реализация данного метода выполнена
// на другом языке, например на C, C++ или ассемблере. Конкретный native int hashCode() реализован на C++, вот
// исходники — http://hg.openjdk.java.net/jdk7/jdk7/hotspot/file/tip/src/share/vm/runtime/synchronizer.cpp функция get_next_hash.


//    При вычислении хэш-кода для объектов класса Object по умолчанию используется Park-Miller RNG алгоритм. В основу работы
// данного алгоритма положен генератор случайных чисел. Это означает, что при каждом запуске программы у объекта будет разный хэш-код.
//
//        Получается, что используя реализацию метода hashCode() от класса Object, мы при каждом создании объекта класса new
// BlackBox(), будем получать разные хеш-коды. Мало того, перезапуская программу, мы будем получать абсолютно разные значения,
// поскольку это просто случайное число.
//
//        Но, как мы помним, должно выполняться правило: “если у двух объектов одного и того же класса содержимое одинаковое,
// то и хеш-коды должны быть одинаковые ”. Поэтому, при создании пользовательского класса, принято переопределять методы hashCode()
// и equals() таким образом, что бы учитывались поля объекта.