package Lessons_4x.Lesson_43_no_inner_for_Stepan;

import Lessons_4x.Lesson_42_.Animal;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Animal43 ded1 = new Animal43("ded", false);
        ArrayList<Animal43> arrOtec = new ArrayList<>();
        Animal43 otec = new Animal43("otec", false);
        arrOtec.add(otec);
        Animal43 sin = new Animal43("sin", false);
        Animal43 sin2 = new Animal43("sin2", false);
        sin2.setIllness(true);
        Animal43 sin3 = new Animal43("sin3", false);
        ArrayList<Animal43> arrSin = new ArrayList<>();
        arrSin.add(sin);
        arrSin.add(sin2);
        arrSin.add(sin3);

        Animal43 vnuk = new Animal43("vnuk", true);
        ArrayList<Animal43> arrVnuk = new ArrayList<>();
        arrVnuk.add(vnuk);

        sin.setChildren(arrVnuk);
        otec.setChildren(arrSin);
        ded1.setChildren(arrOtec);

        System.out.println("Test1 ----------------------------");
        System.out.println(ded1.getChildren().toString());
        throughTree(ded1);



        System.out.println("\nTest2 ----------------------------");
        sin2.setIllness(false);
        sin.setIllness(false);
        sin3.setIllness(false);
        ded1.setIllness(false);
        otec.setIllness(false);
        vnuk.setIllness(false);
        Animal43 vnuk2 = new Animal43("vnuk2", true);
        arrVnuk.add(vnuk2);

        System.out.println(ded1.getChildren().toString());

        throughTree(ded1);

        System.out.println("\nTest3 ----------------------------");
        sin2.setIllness(false);
        sin.setIllness(false);
        sin3.setIllness(false);
        ded1.setIllness(false);
        otec.setIllness(true);
        vnuk.setIllness(false);
        vnuk2.setIllness(false);

        System.out.println(ded1.getChildren().toString());

        throughTree(ded1);

        System.out.println("\nTest4 ----------------------------");
        sin2.setIllness(false);
        sin.setIllness(false);
        sin3.setIllness(false);
        ded1.setIllness(false);
        otec.setIllness(false);
        vnuk.setIllness(false);
        vnuk2.setIllness(false);

        System.out.println(ded1.getChildren().toString());

        throughTree(ded1);

        System.out.println("\nTest5 ----------------------------");
        sin2.setIllness(true);
        sin.setIllness(true);
        sin3.setIllness(true);
        ded1.setIllness(true);
        otec.setIllness(true);
        vnuk.setIllness(true);
        vnuk2.setIllness(true);

        System.out.println(ded1.getChildren().toString());

        throughTree(ded1);

    }

    static public Animal43 throughTree(Animal43 an) {
        if (an.children.size() > 0) {
            an.children.forEach((Animal43 child) -> {
                Animal43 chi = throughTree(child);
                if (chi.illness) { an.setIllness(true);}});
        }
        System.out.println(an.name + ' ' + an.illness);
        return an;
    }

}
//public class Animal43 {
//    String name;
//    Animal43[] children;
//    Boolean illness;
//
//    Animal43( String name, boolean illness) {
//        this.name = name;
//        this.illness = illness;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setChildren(Animal43[] children) {
//        this.children = children;
//    }
//
//    public void setIllness(Boolean illness) {
//        this.illness = illness;
//    }

