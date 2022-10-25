package com.example.homework11.Task1;


public class MyClass {
    public static void main(String[] args) {
        Children children = new Children(10,"Pasha",140);
        Converter<Children, Adult> converter = a -> new Adult(23,"Pasha",183);

        Adult adult = converter.convert(children);

        System.out.println(
                "the child became an adult: name - " +adult.name+ " age - " +adult.age + " growth -" + adult.growth );

    }
}
@FunctionalInterface
interface Converter<T, R>{
    R convert(T t);
    }