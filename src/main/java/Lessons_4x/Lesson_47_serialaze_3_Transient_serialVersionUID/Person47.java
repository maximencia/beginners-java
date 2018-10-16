package Lessons_4x.Lesson_47_serialaze_3_Transient_serialVersionUID;

import java.io.Serializable;

public class Person47 implements Serializable // разрешаем джаве сериализовывать наши объекты
{
    private static final long serialVersionUID = -5137836202787611753L; // нужно генерировать каждый раз когда меняется состав полей класса
    private   int id;
    private  String name ;  //
    private transient  String name2 ;  // мы не хотим это поле сериализовывать


    public Person47(int id, String name,String name2)
    {
        this.id = id;
        this.name = name;
        this.name2 = name2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getName2() {
        return name2;
    }

    @Override
    public String toString() {
        return "Person45{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
