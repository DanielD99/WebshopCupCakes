package business.services;

import business.persistence.BottomMapper;
import business.persistence.Database;
import business.exceptions.UserException;

import java.util.List;


public class BottomFacade {

    BottomMapper bottomMapper;

    public BottomFacade(Database database) {
        bottomMapper = new BottomMapper(database);
    }

    public List<Bottom> getAllBottoms() throws UserException {
        return bottomMapper.getAllBottoms();
    }
}


