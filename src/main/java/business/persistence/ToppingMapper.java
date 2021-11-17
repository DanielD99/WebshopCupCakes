package business.persistence;

import business.exceptions.UserException;
import business.entities.Topping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToppingMapper {

    private Database database;

    public ToppingMapper(Database database)
    {
        this.database = database;
    }

    public List<Topping> getAlltoppings() throws UserException {
        List<Topping> toppingList = null;

        try (Connection connection = database.connect()) {

            String sql = "SELECT * FROM  toppings";

            try (PreparedStatement ps = connection.prepareStatement(sql)) {

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    if (toppingList == null){
                        toppingList = new ArrayList<>();
                    }
                    int topping_id = rs.getInt("topping_id");
                    String name = rs.getString("name");
                    Topping topping = new Topping(topping_id, name);
                    toppingList.add(topping);
                }
            } catch (SQLException ex) {
                throw new UserException(ex.getMessage());
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return toppingList;
    }
}