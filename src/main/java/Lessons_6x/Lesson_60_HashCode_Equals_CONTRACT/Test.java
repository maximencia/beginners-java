package Lessons_6x.Lesson_60_HashCode_Equals_CONTRACT;

/**
 * Created by Maxim.Rumyantsev on 20.11.2018.
 */

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

//        @Override
//        public int hashCode() {
//            int result = id;
//            result = 31 * result + (name != null ? name.hashCode() : 0);
//            return result;
//        }
    }


//     Алгоритм - hashcode b equals contract.
//             1 Проверяем у двух объектов хешкоды - если они разные - выходим
//             2 Если одинаковые - вызываем метод иквалс и вот тут уже окончательно понимаем равны ли объекты.
//

}
