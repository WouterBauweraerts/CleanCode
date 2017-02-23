package cleancode.domain.services;

import cleancode.domain.models.Grocery;
import cleancode.domain.repositories.GroceriesRepository;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by jensde on 23/02/2017.
 */
@Named
public class GroceriesService {
    @Inject
    private GroceriesRepository groceriesRepository;

    public void addGrocery(String name) {
        groceriesRepository.addGrocery(new Grocery(name));
    }
}
