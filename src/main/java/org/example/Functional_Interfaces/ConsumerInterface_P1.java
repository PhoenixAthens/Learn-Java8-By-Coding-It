package org.example.Functional_Interfaces;

import java.util.function.Consumer;

public class ConsumerInterface_P1 {
    public static void main(String... args){
        Consumer<String> c1 = (a)->System.out.println(STR."From c1 \{a}");
        Consumer<String> c2 = System.out::println;

        c1.accept("Joking, am I?");
        c2.accept("I alone, will be left standing!");
//        From c1 Joking, am I?
//        I alone, will be left standing!

        System.out.println("=======================================");
        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("I am the one who will be left standing!");
//      From c1 I am the one who will be left standing!
//      I am the one who will be left standing!

        //c3 will first call the accept method of c1, and then of c2 with the passed argument


    }
}
