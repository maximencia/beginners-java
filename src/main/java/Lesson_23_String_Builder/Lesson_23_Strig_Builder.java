package Lesson_23_String_Builder;

public class Lesson_23_Strig_Builder {
    public static void main(String[] args) {
        String x = "Hello";
        x.toUpperCase();
        System.out.println(x);
        System.out.println(x.toUpperCase());
        x=x.toUpperCase();
        System.out.println(x);

        String s1= "Hello ";
        String s2= "my ";
        String s3= "friend";
        String s4 = s1+s2+s3; // создается дополнительная строка для сохраниния переменных промжуточных - трата ресурсов.
        System.out.println(s4);

        StringBuilder sb = new StringBuilder("! ");
        System.out.println(sb.toString());
        sb.append(s1);
        sb.append(s2).append(s3);
        System.out.println(sb.toString());

    }
}
