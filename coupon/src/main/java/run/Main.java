package run;

import dao.CompanyDAO;
import dao.CompanyDBDAO;
import enteties.Company;
import exeption.AlreadyExistsException;
import exeption.NotExistException;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        CompanyDAO dao = new CompanyDBDAO();


        Company omer = new Company("omer", "lala");
        System.out.println(omer);

        try {
            omer = dao.addCompany(omer);
        } catch (AlreadyExistsException e) {
            e.printStackTrace();
        }

        System.out.println(omer);

    }
}
