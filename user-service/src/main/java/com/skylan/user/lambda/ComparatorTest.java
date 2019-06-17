package com.skylan.user.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorTest {

    public static void main(String[] args) {

      List<String> list =  Arrays.asList(new String[]{"b","A","D","c"});
        Collections.sort(list,(s1,s2)->(s1.compareTo(s2)));
//        list.forEach(e->System.out.println(e));
        System.out.println(list);
        list.stream().map(e-> {return e.toLowerCase();}).collect(Collectors.toList());
        System.out.println(list);

    }

}
