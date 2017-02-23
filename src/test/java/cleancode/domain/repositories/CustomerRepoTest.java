package cleancode.domain.repositories;

import cleancode.domain.models.Customer;
import cleancode.domain.models.LoyaltyCard;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomerRepoTest {

    private CustomerRepository custRepo;

    @Before
    public void setUp() {
        custRepo = new CustomerRepository(new ArrayList<>());
    }

    @Test
    public void customerWouter_savedToCollection_collectionContainsWouter() {
        Customer customer = new Customer(new LoyaltyCard());
        custRepo.addCustomer(customer);
        Assertions.assertThat(custRepo.getCustomers().contains(customer)).isTrue();
    }

    @Test
    public void searchCustomerByBarcode_searchCustomerInRepository_ReturnsExpectedCustomer(){
        LoyaltyCard lc = new LoyaltyCard();
        Customer cust = new Customer(lc);
        custRepo.addCustomer(cust);
        Assertions.assertThat(custRepo.searchCustomerByBarcode(lc.getBarcode()).get()).isEqualTo(cust);
    }

    @Test
    public void searchCustomerByBarcode_CustomerNotInRepository_ReturnsEmptyOptional(){
        LoyaltyCard lc = new LoyaltyCard();
        Customer cust = new Customer(new LoyaltyCard());
        custRepo.addCustomer(cust);
        Assertions.assertThat(custRepo.searchCustomerByBarcode(lc.getBarcode()).isPresent()).isFalse();
    }
}
