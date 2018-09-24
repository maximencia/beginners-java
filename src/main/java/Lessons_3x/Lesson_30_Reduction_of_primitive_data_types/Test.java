package Lessons_3x.Lesson_30_Reduction_of_primitive_data_types;

/**
 * Created by Maxim.Rumyantsev on 19-Sep-18.    https://youtu.be/bHWDG9bfDRg?list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak
 */
public class Test {
    public static void main(String[] args) {
        float f= 123.2F;
        float f2=(float) 123.2;
        long l=123123123123123123L;
        long l1=1231L;

        int a= 123;
        long l_3=a; // неявное


        int x = (int)l_3; // явное

        double d = 123.5;
        int y = (int) d;
        long mm=Math.round(d);
        System.out.println(d);
        System.out.println(mm);
        long mm1=Math.round(y);
        System.out.println(mm1);


        //byte xx = byte 128;  //-128  - 127
        byte xx =(byte) 129;  //-128  - 127


    }
}
