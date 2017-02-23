package cleancode.domain.services;

import cleancode.domain.models.Grocery;
import cleancode.domain.repositories.GroceriesRepository;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

/**
 * Created by jensde on 23/02/2017.
 */
public class GroceriesServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private GroceriesService groceriesService;

    @Mock
    private GroceriesRepository groceriesRepository;

    @Test
    public void addGroceries_ShouldAddGroceries(){
    groceriesService.addGrocery("Bread");
    verify(groceriesRepository).addGrocery(new Grocery("Bread"));
    }
}
