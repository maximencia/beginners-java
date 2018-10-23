package Lessons_4x.Lesson_49_RECURSION;

public class Test {
    public static void main(String[] args) {
        somemethod();
        counter(3);
        System.out.println(factorial (4));
    }
 private static  void somemethod() {
        System.out.println(" Hello ");
        //somemethod();
 }
 private static  void counter (int n) {
        if (n==0) return;
        System.out.println("Before "+ n);
        counter(n-1);
        System.out.println("After" + n);
 }
 private  static int factorial(int n) {
        if (n == 1)
             return 1;
     System.out.println(n);
        return n*factorial(n-1);
     //f4
     // 4*f3
     // 3*f2
     // 2*f1
     //f1 = 1
    }

}

