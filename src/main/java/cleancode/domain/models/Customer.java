package cleancode.domain.models;

import java.util.UUID;

/**
 * Created by wouterba on 23/02/2017.
 */
public class Customer {
    private String id;
    private LoyaltyCard loyaltyCard;

    public Customer(LoyaltyCard loyaltyCard) {
        this.id = UUID.randomUUID().toString();
        this.loyaltyCard = loyaltyCard;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }
}
