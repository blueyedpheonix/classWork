package dao;

import enteties.Customer;
import exeption.AlreadyExistsException;
import exeption.NotExistException;

import java.util.List;

public interface CustomerDAO {

    Customer getCustomerById(long customerId) throws NotExistException;

    List<Customer> getAllCustomer();

    Customer addCustomer(Customer customer) throws AlreadyExistsException;

    void deleteCustomer(long customerId) throws NotExistException;
}
