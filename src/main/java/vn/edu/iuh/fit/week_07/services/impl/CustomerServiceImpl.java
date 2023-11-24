package vn.edu.iuh.fit.week_07.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.week_07.models.Customer;
import vn.edu.iuh.fit.week_07.repositories.CustomerRepository;
import vn.edu.iuh.fit.week_07.services.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new EntityNotFoundException("Customer not found with id: " + customerId));
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long customerId, Customer customer) {
        if (!customerRepository.existsById(customerId)) {
            throw new EntityNotFoundException("Customer not found with id: " + customerId);
        }
        customer.setCustId(customerId);
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        if (!customerRepository.existsById(customerId)) {
            throw new EntityNotFoundException("Customer not found with id: " + customerId);
        }
        customerRepository.deleteById(customerId);
    }
}