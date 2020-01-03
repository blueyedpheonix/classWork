package classes;

import java.util.Random;

public class Car implements Runnable{
    Random rand = new Random();
    private String name;
    private int speed;
    private int distance;
    private int acceleration;
    private static final int destination = 500;
    public Car(int speed,String name,int acceleration){
       this.speed = speed;
       this.name = name;
       this.acceleration = acceleration;
    }
    @Override
    public void run(){
        while(distance < destination){
            System.out.println("the distance that has passed " + distance);
            distance += speed;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acceleration = rand.nextInt(10);
            speed += acceleration;
        }
        System.out.println("finished " + name);
    }
}
