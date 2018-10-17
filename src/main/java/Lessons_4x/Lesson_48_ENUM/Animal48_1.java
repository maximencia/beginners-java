package Lessons_4x.Lesson_48_ENUM;

public enum Animal48_1 {
    DOG("собака"),CAT(" кошка  "),FROG ("  kzueirf " );

    private String translation;
    Animal48_1(String translation) {
    this.translation=translation ;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return " Перевод на русский язык {" +
                "translation='" + translation + '\'' +
                '}';
    }
}
