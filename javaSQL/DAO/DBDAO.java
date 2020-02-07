package DAO;

import DAO.userDAO;
import entitis.User;
import exeption.AlreadyExistsException;
import exeption.NotExistExeption;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBDAO implements userDAO {

    private Connection connection;

    public DBDAO() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db" + "?user=root"
                    + "&password=root" + "&useUnicode=true" + "&useJDBCCompliantTimezoneShift=true"
                    + "&useLegacyDatetimeCode=false" + "&serverTimezone=UTC");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getById(int id) throws NotExistExeption {
        User user = null;
        String sql = "SELECT * FROM USERS WHERE ID = ?";
        try(PreparedStatement pprst = connection.prepareStatement(sql)) {
            pprst.setInt(1,id);
            ResultSet resultSet = pprst.executeQuery();
            while(resultSet.next()) {
                user = genUser(resultSet);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        if (user == null){
            throw new NotExistExeption("there is no user under this id: " + id);
        }

        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> allUsers = new ArrayList<>();
        String sql = "SELECT * FROM USERS";
        try(PreparedStatement pprst = connection.prepareStatement(sql)) {
            ResultSet resultSet = pprst.executeQuery();
            while(resultSet.next()){
                allUsers.add(genUser(resultSet));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allUsers;
    }

    @Override
    public boolean doesThisUserExistFirstNameLastName(String firstName, String lastName) {
       String sql = "SELECT * FROM USERS";
        try(PreparedStatement pprst = connection.prepareStatement(sql)) {
            ResultSet resultSet = pprst.executeQuery();
            while(resultSet.next()){
                if (resultSet.getString(2).equalsIgnoreCase(firstName) &&
                        resultSet.getString(3).equalsIgnoreCase(lastName))
                    return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void addUser(User user) throws AlreadyExistsException {
        String sql = "INSERT INTO my_db.users (FIRST_NAME, LAST_NAME,AGE, BIRTH_DATE)" +
                "VALUES (?,?,?,?)";
        try(PreparedStatement pprst = connection.prepareStatement(sql)) {
            if (!doesThisUserExistFirstNameLastName(user)) {
                pprst.setString(1, user.getFirstName());
                pprst.setString(2, user.getLastName());
                pprst.setInt(3, user.getAge());
                pprst.setDate(4, Date.valueOf(user.getBirthdate()));

                pprst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private User genUser(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String firstName = resultSet.getString(2);
        String lastName = resultSet.getString(3);
        int age = resultSet.getInt(4);
        LocalDate birthDate = resultSet.getDate(5).toLocalDate();
        return new User(id,firstName,lastName,age,birthDate);
    }

}
