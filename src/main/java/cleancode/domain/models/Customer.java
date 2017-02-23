package cleancode.domain.models;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by wouterba on 23/02/2017.
 */
public class Customer {
    private String id;
    private LoyaltyCard loyaltyCard;
    private HashMap<LocalDate, ShoppingCart> boughtPerDay;

    public Customer(LoyaltyCard loyaltyCard) {
        this.id = UUID.randomUUID().toString();
        this.loyaltyCard = loyaltyCard;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public void checkOutCart(ShoppingCart shoppingCart){
        if(!boughtPerDay.containsKey(LocalDate.now())) {
            boughtPerDay.put(LocalDate.now(), shoppingCart);
        }
        else{
            ShoppingCart existingCart = boughtPerDay.get(LocalDate.now());
            existingCart.addGroceries(shoppingCart.getGroceries());
        }
    }

    public ShoppingCart getCart(LocalDate date){
        return boughtPerDay.get(date);
    }
}
