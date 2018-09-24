package Lesson_12_Array_for_each;

public class lesson_12_array_for_each {

        public static void main(String[] args) {

            int[] numbers = new int[5];              //   numbers -> [массив]  Ссылочный тип new данных()
            numbers[0] = 100;
            System.out.println(numbers[0]);
            System.out.println(numbers[1]);

            String[] sss = new String[3];
            sss[0]=" привет ";
            sss[2]=" пока ";

            for (String string_in_sss:sss)
                 {
                     System.out.println(string_in_sss);



            }int[] nums={1,2,3};
            int sum=0;
            for (int x_in_nums:nums)
            {sum=sum+x_in_nums;}
            System.out.println(sum);
        }
    }

