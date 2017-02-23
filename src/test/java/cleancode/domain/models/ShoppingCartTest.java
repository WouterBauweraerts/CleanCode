package cleancode.domain.models;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by paulienl on 23/02/2017.
 */
public class ShoppingCartTest {

    private ShoppingCart shoppingCart;
    private List<Grocery> bought;

    @Before
    public void setUp() {
        shoppingCart=new ShoppingCart();
        bought = new ArrayList<Grocery>();
        Grocery bread = new Grocery("bread");
        Grocery meat = new Grocery("meat");
        bought.add(bread);
        bought.add(meat);
    }

    @Test
    public void getGroceries() {
        shoppingCart.addGroceries(bought);
        Assertions.assertThat(bought).isEqualTo(shoppingCart.getGroceries());
    }
}