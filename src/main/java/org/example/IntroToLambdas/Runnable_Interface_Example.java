package org.example.IntroToLambdas;

public class Runnable_Interface_Example {
    public static void main(String... args){
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello there!");
            }
        };
        Runnable run2 = () -> System.out.println("Hello there!");
        Runnable run3 = () ->{
            System.out.println("Hi, I am Cassandra");
            System.out.println("Yeah, I do like CockroachDB");
        };
        new Thread(run1).start();
        new Thread(run2).start();
        new Thread(run3).start();
        new Thread(()->{
            System.out.println("Yo! Wassup?");
            System.out.println("Julia is doing fine!");
        }).start();

        //OUTPUT:
        /*
        * Hello there!
        * Hi, I am Cassandra
        * Yeah, I do like CockroachDB
        * Hello there!
        * Yo! Wassup?
        * Julia is doing fine!
        * */
    }

}
