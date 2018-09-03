import java.util.Scanner;

class lesson_10_Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please input your age");
        int age =s.nextInt();
        switch (age) {
            case 0 :  System.out.println("Newborn child"); break;
            case 7 :  System.out.println("puple"); break;
            case 18 :  System.out.println("student"); break;
            default:
                System.out.println("out of control");

    }

}

}
