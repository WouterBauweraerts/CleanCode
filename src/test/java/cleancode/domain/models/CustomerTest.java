package cleancode.domain.models;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class CustomerTest {

   private Customer customer;
   private ShoppingCart shoppingCart;

    @Before
    public void setUp(){
        customer = new Customer(new LoyaltyCard());
        shoppingCart=new ShoppingCart(); 
    }

    @Test
    public void customerIsLinkedWithALoyaltyCard(){

        Assertions.assertThat(customer.getLoyaltyCard()).isNotNull();
    }

    @Test
    public void checkOutCartAddsCartToDate(){
        customer.checkOutCart(shoppingCart);
        Assertions.assertThat(customer.getCart(LocalDate.now())).isEqualTo(shoppingCart);
    }
}
