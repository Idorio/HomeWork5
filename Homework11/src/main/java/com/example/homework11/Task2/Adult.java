package com.example.homework11.Task2;

import java.util.ArrayList;
;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Adult {
    public static void main(String[] args) {

        ArrayList<Values> values = new ArrayList<>();
        values.add(new Values(23, "Pasha"));
        values.add(new Values(31, "Jenia"));
        values.add(new Values(27, "Andrei"));
        values.add(new Values(45, "Victor"));



        Stream<Values> oldestAdult = values.stream().skip(1)
                .limit(2);  //  немогу разобрать как отфильтровать по возрасту

        System.out.print("The oldest adult ");
    }

    }









