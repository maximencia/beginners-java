package Lessons_4x.Lesson_45_serialize;

import java.io.Serializable;

public class Person45 implements Serializable // разрешаем джаве сериализовывать наши объекты
{
 private int id;
 private String name;

    public Person45(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person45{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
