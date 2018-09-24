package Lesson_24_String_formatting;

public class Lesson_24_String_formatting {
    public static void main(String[] args) {
        System.out.print("Hello");
        String s1 ="!!!";
        int d1 = 100;
        System.out.printf(" my dear frind %s = %d", s1 , d1);
        // d% число
        // s - строка
        System.out.printf("String %10d \n",532);
        System.out.printf("String %10d \n",5);
        System.out.printf("String %10d \n",12532);
        System.out.printf("String %10d \n",1212532);
        System.out.printf("String %10d \n",121212532);
        System.out.printf("\n");

        System.out.printf("String %-10d \n",532);
        System.out.printf("String %-10d \n",5);
        System.out.printf("String %-10d \n",12532);
        System.out.printf("String %-10d \n",1212532);
        System.out.printf("String %-10d \n",121212532);

        System.out.printf("\n");
        System.out.printf("String %.2f \n",12.1212532);
        System.out.printf("String %.2f \n",12.2532);
        System.out.printf("String %.2f \n",12.00212532);
        System.out.printf("String %.2f \n",12.2);
        System.out.printf("String %.2f \n",12.12532); System.out.printf("String %.2f \n",12.1212532);
        System.out.printf("String %.3f \n",12.2532);
        System.out.printf("String %.4f \n",12.00212532);
        System.out.printf("String %.5f \n",12.2);
        System.out.printf("String %.6f \n",12.12532);

        System.out.printf("\n");
    }
}
