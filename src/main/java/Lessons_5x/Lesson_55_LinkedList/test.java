package Lessons_5x.Lesson_55_LinkedList;

public class test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(10);
        myLinkedList.add(100);
        myLinkedList.add(1000);
        myLinkedList.add(10000);
        myLinkedList.add(100000);
        myLinkedList.add(1000000);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        //System.out.println(myLinkedList.get(15));

        System.out.println(myLinkedList.get_size());
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get_size());
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get_size());
    }
}
