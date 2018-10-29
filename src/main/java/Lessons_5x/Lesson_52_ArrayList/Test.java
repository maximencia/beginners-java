package Lessons_5x.Lesson_52_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Test {

    public static void main(String[]args){
    ArrayList<Integer> alist= new ArrayList<>();
    int i =0;
    for(; ; )
    { alist.add(i); i++;
        if (i==10){ break;}

    }
        System.out.println(alist);
        alist.remove(2);
        System.out.println(alist);
        System.out.println("0 - " + alist.get(0));
        //System.out.println(alist.get(99));
        System.out.println("size - " + alist.size());
        i=0;

        for (Integer x: alist)
        {
            System.out.println(x);
            if (i==5) {alist.remove(i); }   //https://habr.com/post/325426/ ConcurrentModificationException ХАХА

            i++;
        }


        // метод ремув очень не эффективен!


        //ArrayList<Integer> alist1= new ArrayList<>();
        //но правильнее делать так по конвенции
        List<Integer> alist1= new ArrayList<>();
        // vs проводим много удалений из массива
        //мы можем поменять реализацию прямо на ходу
        alist1 = new LinkedList<>();


    }


}

//
//    Reader in = new InputStreamReader(inputStream, charset);
//        for (; ; ) {   //Бесконечный цикл если в теле цикла не написано условие выхода.
//                int rsz = in.read(buffer, 0, buffer.length);
//                if (rsz < 0)
//        break;
//        out.append(buffer, 0, rsz);
//        }
//        return out.toString();