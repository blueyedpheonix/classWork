package DAO;

import entitis.User;
import exeption.AlreadyExistsException;
import exeption.NotExistExeption;

import java.util.List;

public interface userDAO {

    User getById(int id) throws NotExistExeption;
    List<User> getAll();
    boolean doesThisUserExistFirstNameLastName(String firstName, String lastName);
    void addUser(User user) throws AlreadyExistsException;
}
