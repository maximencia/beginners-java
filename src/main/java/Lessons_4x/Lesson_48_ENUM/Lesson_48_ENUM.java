package Lessons_4x.Lesson_48_ENUM;


import static Lessons_4x.Lesson_48_ENUM.Animal48.*;

public class Lesson_48_ENUM {
    private static final int  DOG =0;
    private static final int  CAT =1;
    private static final int  FROG =2;

    public static void main(String[] args) {
        int animal = DOG;

        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
            break;
        case FROG:
                System.out.println("It's a Frog");
            break;
            default:
                System.out.println("It's not an animal");
        }


        Animal48 animal2 = Animal48.CAT;

        switch (animal2) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a Frog");
                break;
                case CAT:
                System.out.println("It's a CAT");
                break;
            default:
                System.out.println("It's not an animal");
        }

       //Object ->  Наш класс
       //Object -> Enum -> Season


        Season season;
        season = Season.SUMMER;
        System.out.println("It's " + season + " now.");

        System.out.println(season instanceof Season);
        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Object);
        System.out.println(season.getClass());


        Animal48_1 animal_1 = Animal48_1.CAT;
        System.out.println(animal_1.getTranslation());
        System.out.println(animal_1.name());

        System.out.println(animal_1.toString());  // можно не указывать - вызывается по умолчанию.
        System.out.println(animal_1);

        Season se = Season.AUTUMN;
        System.out.println(se.getTemperature());
        System.out.println(se.name());
        System.out.println(se.temperature);

        Animal48_1 cat  = Animal48_1.valueOf("CAT");
        System.out.println(cat.getTranslation());

        // порядок ENUM
        Season seas1 =  Season.WINTER;
        System.out.println(seas1.ordinal());

    }

}
