package org.example.Imperative_V_Declarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Imperative_v_Declarative_P2 {
    public static void main(String... args){
        List<Integer> listWithDuplicates = Arrays.asList(1,2,3,4,5,5,6,7,8,9,9,10,10,1,2,3,4,5,5,5,9,10,11,8,7);

        //obtain a list of unique values from 'listWithDuplicates'

        //imperative-approach
        List<Integer> unique1 = new ArrayList<>();
        for(int i: listWithDuplicates){
            if(!unique1.contains(i)){
                unique1.add(i);
            }
        }
        System.out.println(STR."UniqueList: \{unique1}");
        //UniqueList: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

        //declarative-approach
        List<Integer> unique2 = listWithDuplicates
                .stream()
                .distinct().toList();
        System.out.println(STR."UniqueList2: \{unique2}");
        //UniqueList2: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    }
}
