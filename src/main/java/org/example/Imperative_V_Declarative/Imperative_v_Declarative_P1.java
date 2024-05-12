package org.example.Imperative_V_Declarative;

import java.util.stream.IntStream;

public class Imperative_v_Declarative_P1 {
    public static void main(String... args){
        //Sum of 100 whole numbers, starting from 0

        //Imperative-Approach
        int sum = 0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println(STR."IMP: The sum of 100 whole numbers starting at 0 is \{sum}");

        //Declarative-Approach (Single-Threaded)
        int sum2 = IntStream.rangeClosed(0,100).sum();
        System.out.println(STR."DCR: The sum of 100 whole numbers starting at 0 is \{sum2}");

        //Declarative-Approach (Multi-Threaded)
        int sum3 = IntStream.range(0,101).parallel().sum();
        System.out.println(STR."DCR-P: The sum of 100 whole numbers starting at 0 is \{sum3}");

//        IMP: The sum of 100 whole numbers starting at 0 is 5050
//        DCR: The sum of 100 whole numbers starting at 0 is 5050
//        DCR-P: The sum of 100 whole numbers starting at 0 is 5050

    }
}
