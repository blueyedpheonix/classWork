package classes;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Xx1 {
    public static void main(String[] args) {
//        Thread lol = new Thread(() -> {
//            System.out.println("Hello World");
//        });
//        lol.start();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        };
//        Thread t = new Thread(run);
//
//
//
//
//        Thread hey = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

//       String name;
//        Predicate<String> checkUp = new Predicate<String>() {
//            @Override
//            public boolean test(String name) {
//                if(name.equalsIgnoreCase("Dylan")){
//                    return true;
//                }else
//                    return false;
//            }
//        };
//        Scanner imput = new Scanner(System.in);
//        name= imput.nextLine();
        BiFunction<Integer,Integer,Integer> lamalo = (num,num2) -> num + num2;
        System.out.println(lamalo.apply(6,5));
        
        Function<Integer,Integer> addFive = lala(3);
        System.out.println(addFive.apply(4));

    }

    public static void ifTrue(Predicate<String> check, String name, Runnable action){
        if(check.test(name)){
            action.run();
        }
    }
    public static Function<Integer,Integer> lala(int num) {
        return (num2) -> num + num2;
    }

}
