package cleancode.domain.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulienl on 23/02/2017.
 */
public class ShoppingCart {
    private List<Grocery> groceries;

    public ShoppingCart() {
        groceries = new ArrayList<>();
    }

    public List<Grocery> getGroceries(){
        return groceries;
    }

    public void addGroceries(List<Grocery> newGroceries){
        groceries.addAll(newGroceries);
    }
}
