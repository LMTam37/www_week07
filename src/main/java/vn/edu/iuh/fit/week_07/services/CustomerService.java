package vn.edu.iuh.fit.week_07.services;

import vn.edu.iuh.fit.week_07.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long customerId);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Long customerId, Customer customer);

    void deleteCustomer(Long customerId);
}