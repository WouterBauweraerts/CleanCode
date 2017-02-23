package cleancode.domain.repositories;

import cleancode.domain.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


public class CustomerRepository {
    private List<Customer> customers;

    @Autowired
    public CustomerRepository(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    public Optional<Customer> searchCustomerByBarcode(String barcode) {
        return customers.stream()
                .filter(c -> c.getLoyaltyCard().getBarcode().equals(barcode))
                .findFirst();
    }
}
