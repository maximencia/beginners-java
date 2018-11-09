package Lessons_5x.Lesson_55_LinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;
    public void add(int value){
        //  если это  первое добавление в список
        if (head==null) {
            this.head= new Node (value);
            }

            else{
            Node temp = head ;
            while (temp.getNext()!=null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
            }
        size++;

    }

    public String toString() {
        int [] res= new int[size];
        int idx = 0 ;
        Node temp = head;
        while (temp !=null) {
            res[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(res);
    }

    public int get (int index){
        int curidx =0;
        Node temp=head;

        while (temp != null) {
            if (curidx == index) {
                return temp.getValue();
            }
            else {
                temp = temp.getNext();
                curidx++;
            }
        }
        // индекс который был передан в качестве аргумента больше чем максимальный в нашем списке
        throw new IllegalArgumentException();
    }
    public int get_size (){
        return size;
    }




    public void remove (int index){      // [1] -> [2]  -> [3]  нужно удалить ссылку на двойку и поменять ее на ссылку на тройку
        int curidx =0;
        Node temp=head;

        // если передан 0 элемент то это отдельный случай
        if(index == 0)
        {head = head.getNext();  // двигаем начальный элемент на следующего :)
         size--;
         return; // выходим

        }



        while (temp != null) {
            if ((curidx + 1)== index) {  //попадаем в элемент предшетсвуещем тому который хотим удалить
                temp.setNext(temp.getNext().getNext()); // мы получаем следующий узел следующего узла и
                // приравниваем его к текущему - теперь с 1 ки мы ссылаемся на тройку
                size--;  // так как мы удалили элемент уменьшаем и его размер
                return;  // удалили и выходим.
            }
            else {
                temp = temp.getNext();
                curidx++;
            }
        }

        // индекс который был передан в качестве аргумента больше чем максимальный в нашем списке
        throw new IllegalArgumentException();
    }





    private static class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
    }


