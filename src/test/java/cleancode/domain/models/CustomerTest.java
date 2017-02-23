package cleancode.domain.models;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp(){
        customer = new Customer(new LoyaltyCard());
    }

    @Test
    public void customerIsLinkedWithALoyaltyCard(){
        Assertions.assertThat(customer.getLoyaltyCard()).isNotNull();
    }
}
