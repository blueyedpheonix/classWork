package classes;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private String greeting;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age, String greeting) {
        this.name = name;
        this.age = age;
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", greeting='" + greeting + '\'' +
                '}';
    }

//    @Override
//    public void run() {
//        System.out.println("Hello my name is " + name);
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("And I am  " + age + " years old");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(greeting);
//    }
}

