package cleancode.domain.repositories;

import cleancode.domain.models.Grocery;

import javax.inject.Named;
import java.util.ArrayList;

/**
 * Created by jensde on 23/02/2017.
 */
@Named
public class GroceriesRepository {

    private ArrayList<Grocery> groceries = new ArrayList<>();

    public void addGrocery(Grocery grocery){
        groceries.add(grocery);
    }
}
