package Runners;

import classes.Car;

public class Main2 {
    public static void main(String[] args) {

        Thread car = new Thread(new Car (2,"Omer",5));
        Thread car2 = new Thread(new Car(3,"Dylan",3));
        Thread car3 = new Thread(() -> {
            System.out.println("hello");
        });
        car3.start();
//        car.start();
//        car2.start();
        Thread car4 = new Thread(new Runnable() {
            @Override
            public void run() {
                int counter = 0;
                System.out.println("I am the best ");
                for (int i = 0; i < 10; i++){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("nana " + ++counter);
                }
            }
        });
        car4.start();
    }
}
