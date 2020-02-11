package dao;

import dao.CompanyDAO;
import enteties.Company;
import exeption.AlreadyExistsException;
import exeption.NotExistException;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompanyDBDAO implements CompanyDAO {

    private Connection connection;

    public CompanyDBDAO() {

        try {
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db" + "?user=root"
                    + "&password=root" + "&useUnicode=true" + "&useJDBCCompliantTimezoneShift=true"
                    + "&useLegacyDatetimeCode=false" + "&serverTimezone=UTC"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Company getByCompanyId(long companyId) throws NotExistException {
        Company company = null;
        String sql = "SELECT * FROM COMPANY WHERE ID = ?";
        try(PreparedStatement ptsd = connection.prepareStatement(sql)) {
            ptsd.setLong(1,companyId);
            ResultSet resultSet = ptsd.executeQuery();
            while(resultSet.next()){
                String name = resultSet.getString(2);
                String password = resultSet.getString(3);
                company = new Company(name,password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (company == null){
            throw new NotExistException(String.format("the company under the id %b does not exist",companyId));
        }
        return company;
    }

    @Override
    public List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();

    }

    @Override
    public boolean login(String name, String password) {
        return false;
    }

    @Override
    public Company addCompany(Company company) throws AlreadyExistsException {
        if (getByName(company.getName()) != null){
            throw new AlreadyExistsException(String.format("the company under the name : %s alredy exits",
                    company.getName()));
        }
        String sql = "INSERT INTO COMPANY(NAME,PASSWORD) VALUES(?,?)";
        try(PreparedStatement ptsd = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            ptsd.setString(1,company.getName());
            ptsd.setString(2,company.getPassword());
            ptsd.executeUpdate();

            ResultSet resultSet = ptsd.getGeneratedKeys();
            if(resultSet.next()){
                long id = resultSet.getLong(1);
                company.setId(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return company;
    }

    @Override
    public Company updateCompany(Company company) throws NotExistException {
        return null;
    }

    @Override
    public Company deleteCompany(long companyId) throws NotExistException {
        return null;
    }

    public Company getByName (String name){
        Company company = null;
        String sql = "SELECT * FROM COMPANY WHERE NAME = ?";
        try(PreparedStatement ptsd = connection.prepareStatement(sql)) {

            ptsd.setString(1,name);
            ResultSet resultSet = ptsd.executeQuery();

            while(resultSet.next()){
                company = new Company(resultSet.getString(2),resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return company;
    }
}
