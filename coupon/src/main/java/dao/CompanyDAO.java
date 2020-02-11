package dao;

import enteties.Company;
import exeption.AlreadyExistsException;
import exeption.NotExistException;

import java.util.List;

public interface CompanyDAO {

    Company getByCompanyId(long companyId) throws NotExistException;

    List<Company> getAllCompanies();

    boolean login(String name, String password);

    Company addCompany(Company company) throws AlreadyExistsException;

    Company updateCompany(Company company) throws NotExistException;

    Company deleteCompany (long companyId) throws NotExistException;
}
