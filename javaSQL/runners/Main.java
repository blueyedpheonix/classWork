package runners;

import DAO.DBDAO;
import DAO.userDAO;
import entitis.User;
import exeption.NotExistExeption;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        userDAO userDAO = new DBDAO();
        List<User> users = new ArrayList<>();
        users.addAll(userDAO.getAll());
        users.forEach(System.out::println);
    }
}
