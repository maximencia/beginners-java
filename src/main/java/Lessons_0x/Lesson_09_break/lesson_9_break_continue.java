package Lessons_0x.Lesson_09_break;

public class lesson_9_break_continue {
//https://www.youtube.com/watch?v=XV1M9sSWrhI&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=8
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("we are getout from cycle");

        for (int ii = 0; ii <= 30; ii++) {
            if (ii % 2 == 0) { continue;}

            if (ii % 3 == 0) { continue;}
            //Error:(16, 17) java: unreachable statement    System.out.println("test");

            System.out.println(ii + "не делится на 2 и на 3");
        }
    }
}