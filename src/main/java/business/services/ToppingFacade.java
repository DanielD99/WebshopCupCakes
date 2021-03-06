package business.services;

import business.entities.Topping;
import business.persistence.Database;
import business.exceptions.UserException;
import business.persistence.ToppingMapper;

import java.util.List;


public class ToppingFacade {

    ToppingMapper toppingMapper;

    public ToppingFacade(Database database) {
        toppingMapper = new ToppingMapper(database);
    }

    public List<Topping> getAllToppings() throws UserException {
        return toppingMapper.getAlltoppings();
    }
}


