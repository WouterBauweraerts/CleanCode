package cleancode.domain.repositories;

import cleancode.domain.models.Customer;
import cleancode.domain.models.Grocery;
import cleancode.domain.models.ShoppingCart;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by jensde on 23/02/2017.
 */
@Named
public class GroceriesRepository {

    private ArrayList<Grocery> groceries = new ArrayList<>();

    public void addGrocery(Grocery grocery) {
        groceries.add(grocery);
    }
}