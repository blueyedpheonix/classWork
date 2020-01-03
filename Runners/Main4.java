package Runners;

import classes.Dao;
import classes.DaoIO;
import classes.Person;

import java.io.File;

public class Main4 {
    public static void main(String[] args) {
        File file = new File("Dylanfile.dat");
        Person  p = new Person("dylan ", 24,"Hello hello hello lol");
        Dao<Person> lol = new DaoIO<>(file);
        lol.writeOB(p);
        Person p2 = lol.readOB();
        System.out.println(p2);
    }
}
