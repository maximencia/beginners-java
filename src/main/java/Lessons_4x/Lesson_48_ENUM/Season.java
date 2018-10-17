package Lessons_4x.Lesson_48_ENUM;

public enum Season {
    AUTUMN(5), SPRING(5), SUMMER(20), WINTER(-20);

    int temperature;
    Season(int temperature)
    {
       this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
