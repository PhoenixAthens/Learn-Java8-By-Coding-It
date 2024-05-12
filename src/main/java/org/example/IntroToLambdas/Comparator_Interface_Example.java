package org.example.IntroToLambdas;

import java.util.Comparator;

public class Comparator_Interface_Example {
    public static void main(String... args){
        Comparator<Integer> comp1 = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Comparator<Integer> comp2 = (Integer a, Integer b)->a.compareTo(b);
        Comparator<Integer> comp3 = (a,b)->a.compareTo(b);
        Comparator<Integer> comp4 = Integer::compareTo;

        System.out.println(comp1.compare(23,45));   //-1
        System.out.println(comp2.compare(-1,-89));  //1
        System.out.println(comp3.compare(108,107)); //1
        System.out.println(comp4.compare(109,109)); //0

    }
}
