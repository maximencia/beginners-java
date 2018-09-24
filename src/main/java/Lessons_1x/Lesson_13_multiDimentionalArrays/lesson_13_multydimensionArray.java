package Lessons_1x.Lesson_13_multiDimentionalArrays;

public class lesson_13_multydimensionArray {
    public static void main(String[] args) {

        int[] numbers ={1,2,3};
        int [][] matrix={{1,2,3},{4,5,6},numbers};
        for (int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        for(int x:matrix[1])
        {
            System.out.println(x);
        }

//        for(int xx:matrix[][]){
//            System.out.println(xx);
//        }
    }
}
