package Lessons_4x.Lesson_46_serialize_2_array_to_File;

import java.io.Serializable;

public class Person46 implements Serializable // разрешаем джаве сериализовывать наши объекты
{
 private int id;
 private String name;

    public Person46(int id, String name)
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
