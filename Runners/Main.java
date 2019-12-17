package Runners;

import Others.Person;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        friends.add("Dylan");
        friends.add("Omer");
        friends.add("Jake");
        friends.add("Yonatan");
        friends.add("Edan");
        System.out.println(friends.toString());
        System.out.println();
        for(String name: friends){
            System.out.println(name);
        }
        friends.remove("Dylan");
        System.out.println();
        for(String name: friends){
            System.out.println(name);
        }
        for(int i = 0; i < friends.size(); i++){
            if(friends.get(i) == "Jake")
                friends.remove(i);
        }

        System.out.println();

        for(String name: friends){
            System.out.println(name);
        }

        Set<String> newFriends = new HashSet<>();
        newFriends.add("enosh");
        newFriends.add("Soren");
        newFriends.add("Sara");
        newFriends.add("Gilad");
        newFriends.add("Gilad");
        newFriends.add("maor");
        System.out.println(newFriends);
        newFriends.remove("maor");
        System.out.println(newFriends);




    }
}

