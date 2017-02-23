package cleancode.domain.models;

import java.util.UUID;

/**
 * Created by wouterba on 23/02/2017.
 */
public class LoyaltyCard {
    private String barcode;
    private int bonusPoints;

    public LoyaltyCard() {
        barcode = UUID.randomUUID().toString();
        bonusPoints=0;
    }

    public String getBarcode(){
        return barcode;
    }
}
